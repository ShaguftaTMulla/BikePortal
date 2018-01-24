package crawl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling_demo {

	public static void main(String[] args) {
		
		try {
			ArrayList<String> list=new ArrayList<>();
			Document doc=Jsoup.connect("https://www.bajajauto.com/motor-bikes").get();
			Element ele=doc.getElementsByClass("ftr-links").first();
			Elements link=ele.select("a");
			for (Element element : link)
			{
				list.add(element.absUrl("href"));
			}
			list.removeAll(Arrays.asList(null,""));
			System.out.println(list+"\n");
			for (String bikelink: list) 
			{
				String bypass="https://www.bajajauto.com/motor-bikes";
				String abc="https://www.bajajauto.com/motor-bikes/dominar-400-specifications";
				 System.out.println(bikelink +"\n");

					if(!bikelink.equals(bypass)&&!bikelink.equals(abc))
					{
						
					System.out.println("bikelink ");
						String links=bikelink+"-specifications";
						Document doc1=Jsoup.connect(links).get();
						System.out.println("link");
			
			int j=0;int i=0;
			while(true)
			{
				Element bikelinks=doc.select("table").get(i);
				Element tdlast=bikelinks.select("td").last();
				Element bylast=bikelinks.select("td").last();
				while(true)
				{
					Element bytag=bikelinks.select("td").get(j);
					System.out.println(bytag.text());
				
					if( bytag==tdlast)
					{
						break;
					}
					j=j+2;
				}
				
				if(bikelinks==tdlast)
				{
					break;
				}
				i++;
			}
			
		
					}
			}
		
		
		}catch (Exception e) 
		{
			e.printStackTrace();
		
		}
		
	
	}
}
	
