package crawl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class demo1 {

	public static void main(String[] args)
	{
		try {
			ArrayList<String> list1=new ArrayList<>();
			Document doc2=Jsoup.connect("https://www.bajajauto.com/motor-bikes").get();
			Element ele1=doc2.getElementsByClass("has-submenu").get(1);
			Elements a=ele1.select("ul");
			Elements ele2=a.select("ul");
			Element ele4=ele2.select("li").first();
			Elements link1=ele4.select("a");
			for (Element element : link1)
			{
				list1.add(element.absUrl("href"));
			}	
			list1.removeAll(Arrays.asList(null,""));
			System.out.println(list1+"\n");
			
			
			
			ArrayList<String> list3=new ArrayList<>();
			Document doc3=Jsoup.connect("https://www.bajajauto.com/motor-bikes").get();
			Element ele111=doc3.getElementsByClass("sub-ftr-links").get(1);
			Elements link3=ele111.select("a");
			for (Element element : link3)
			{
				list3.add(element.absUrl("href"));
			}	
			list3.removeAll(Arrays.asList(null,""));
			System.out.println(list3+"\n");
			
			
	/*		
		ArrayList<String> list4=new ArrayList<>();
			Document doc4=Jsoup.connect("https://www.bajajauto.com/motor-bikes").get();
			Element ele6=doc4.getElementsByClass("sub-ftr-links").last();
			Elements link4=ele6.select("a");
			for (Element element : link4)
		{
				list4.add(element.absUrl("href"));
			}	
			list4.removeAll(Arrays.asList(null,""));
			System.out.println(list4+"\n");
			*/
			
			
			
			ArrayList<String> list=new ArrayList<>();
			Document doc=Jsoup.connect("https://www.bajajauto.com/motor-bikes").get();
			Element as=doc.getElementsByClass("ftr-links").first();
			Elements link=as.select("a");
			for (Element element : link)
			{
				list.add(element.absUrl("href"));
			}	
			list.removeAll(Arrays.asList(null,""));
			System.out.println(list+"\n");
			for (String bikelink: list) 
			{
				//String bypass="https://www.bajajauto.com/motor-/dominar-400";
					String abc="https://www.bajajauto.com/motor-bikes/avenger#";
				// System.out.println("\n"+ bikelink+"\n")
					 String linktag="https://www.bajajauto.com/motor-bikes/dominar-400";
					 //System.out.println(linktag);
					 if(linktag.equals(bikelink))
					 {
					 Document doc1=Jsoup.connect("https://www.bajajauto.com/motor-bikes/dominar-400-specifications").get();
					 System.out.println(linktag);
					 int j=0;
					 while(true)
					 {
						 Elements td=doc1.getElementsByClass("table");
						 Element bytag=td.select("table").get(j);
		 					Element bylast=td.select("table").last();	
		 					Element last=bytag.select("td").last();
		 					int i=1;
		 					while(true)
		 					{
		 						Element tag=bytag.select("td").get(i);
		 						System.out.println(tag.text());
		 						if(last==tag)
		 						{
		 							
		 							break;
		 						}
		 						i=i+2;
		 					}
		 					
		 					if(bytag==bylast)
		 					{
		 						break;
		 					}
		 					j++;
					 }
			 		}
					 for (String  bikelink1 : list3)
			 		{
			 			
			 			 Document doc1=Jsoup.connect(bikelink1+"-features").get();
						 System.out.println(bikelink1);
			 			 int j=0;
						 while(true)
						 {
							 Elements td=doc1.getElementsByClass("table");
							 Element bytag=td.select("table").get(j);
			 					Element bylast=td.select("table").last();	
			 					Element last=bytag.select("td").last();
			 					int i=1;
			 					while(true)
			 					{
			 						Element tag=bytag.select("td").get(i);
			 						System.out.println(tag.text());
			 						if(last==tag)
			 						{
			 							
			 							break;
			 						}
			 						i=i+2;
			 					}
			 					
			 					if(bytag==bylast)
			 					{
			 						break;
			 					}
			 					j++;
						 }
						 
						 
						 
						 for (String  element : list1)
					 		{
					 			
					 			 Document doc0=Jsoup.connect(bikelink1+"-features").get();
								 System.out.println(bikelink1);
					 			 int k=0;
								 while(true)
								 {
									 Elements td=doc1.getElementsByClass("table");
									 Element bytag=td.select("table").get(k);
					 					Element bylast=td.select("table").last();	
					 					Element last=bytag.select("td").last();
					 					int i=1;
					 					while(true)
					 					{
					 						Element tag=bytag.select("td").get(i);
					 						System.out.println(tag.text());
					 						if(last==tag)
					 						{
					 							
					 							break;
					 						}
					 						i=i+2;
					 					}
					 					
					 					if(bytag==bylast)
					 					{
					 						break;
					 					}
					 					k++;
								 }
			 		}
			 		}
			 					
			 
			}
			
		
						 
		} catch(IOException e) 
			{
		 		e.printStackTrace();
		 	}
		
		
	}

	
	}


