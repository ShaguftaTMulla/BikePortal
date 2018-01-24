package crawl;

import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Demo3 {

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
						
					System.out.println("dominar bike9inks ");
						
					String links=bikelink;
						if(bikelink.equals("https://www.bajajauto.com/motor-bikes/dominar-400"))
						{
							links=bikelink+"-specifications";
						}
						else if(bikelink.equals("https://www.bajajauto.com/motor-bikes/avenger-cruise-220"))
						{
							links=bikelink+"-features";
						}
						else if(bikelink.equals("https://www.bajajauto.com/motor-bikes/avenger-street-220"))
						{
							links=bikelink+"-features";
						}
						
						
						Document doc1=Jsoup.connect(links).get();
						int i=0;
						while(true)
						{
							Element bikelinks=doc1.getElementsByClass("table").get(i);
							
							Element bikelinkslast=doc1.getElementsByClass("table").last();
							Element bikelinkslastrows=bikelinkslast.select("td").last();
							
							Element tdlast=bikelinks.select("tr").last();
							//System.out.println(tdlast);
							Element bylast=bikelinks.select("td").last();
							int j=0;
							while(true)
							{
								Element bytag=bikelinks.select("td").get(j);
								System.out.println(bytag.text());
								j=j+1;
								//System.out.println(bytag+"bbbbbbbbbbbbttttttttttt");
								//System.out.println(bylast+"bbbbbbbbbbbbbbllllllllllllllllll");
								if( bytag==bylast)
								{
									//System.out.println("i am breaking.................");
									break;
								}
								
							}
							
							//System.out.println(bikelinkslastrows+"bbbbbbbbbbbbttttttttttt");
							//System.out.println(bylast+"bbbbbbbbbbbbbbllllllllllllllllll");
							if(bikelinkslastrows==bylast)
							{
								break;
							}
							i++;
						}
						
						System.out.println(link);
						
					
				 
				 
			
						}
					}
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		
		}
		

	

	}}
