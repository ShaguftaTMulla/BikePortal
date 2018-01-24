package crawl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingBajajBike {

	public static void main(String[] args)
	{

		ArrayList<String> list=new ArrayList<>();
		try {
			Document doc=Jsoup.connect("https://www.bajajauto.com/motor-bikes").get();
			Element ele=doc.getElementsByClass("ftr-links").first();
			Elements link=ele.select("a[href]");
			for (Element element : link)
			{
		//		System.out.println(element.absUrl("href"));
				list.add(element.absUrl("href"));
			}
			list.removeAll(Arrays.asList(null,""));
		//	System.out.println(list);

			for (String bikelink : list) 
			{
				System.out.println(bikelink);
				String bypass="https://www.bajajauto.com/motor-bikes";
				String abc="https://www.bajajauto.com/motor-bikes/dominar-400-specifications";
			System.out.println(bikelink +"\n");

				if(!bikelink.equals(bypass)&&!bikelink.equals(abc))
				{
					System.out.println("bikelink ");
					String links=bikelink+"-specifications";
					Document doc1=Jsoup.connect(links).get();
					ArrayList<String> list1=new ArrayList<>();
					for(int i=0;i<5;i++)
					{
						Element bytag=doc1.select("table").get(i);
						Elements tds=bytag.select("\ntd+td");
						list1.add(tds.text());
						
					}
					System.out.println(list1);

//					int j=0;int i=0;
//					while(true)
//					{
//						Element bytag=doc1.select("table").get(i);
//						Element bytg=doc1.select("table").last();
//
//
//						Element bylast=bytg.select("td").last();
//						System.out.println(bikelink);
//
//						while(true)
//						{
//							Element xyz=bytg.select("td").get(j);
//							System.out.println(xyz.text());
//							if(xyz==bylast)
//							{
//								break;
//							}
//							j=j+1;
//						}
//						if(bytag==bytg)
//						{
//							break;
//						}
//						i++;
//
//					}
				}
				break;
			}
		}


			catch (IOException e) 
			{

				e.printStackTrace();
			}
	}
}
		




