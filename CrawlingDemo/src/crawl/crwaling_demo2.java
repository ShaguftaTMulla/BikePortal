package crawl;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class crwaling_demo2 {

	public static void main(String[] args) {
			try 
			{
				ArrayList<String> list=new ArrayList<String>();
			 	Document doc1 = Jsoup.connect("https://www.heromotocorp.com/en-in/the-bike/two-wheeler-motorcycles.html").get();
			 	Element bikelinks=doc1.getElementById("prodMenu");
			 	Elements bikelink=bikelinks.select("a");
			 	for( Element blink : bikelink)
			 	{
			 		list.add(blink.absUrl("href"));
			 	}
			 	for (String element1 : list)
			 	{
			 		String abc="https://www.heromotocorp.com/en-in/the-bike/two-wheeler-motorcycles.html#";
			 		System.out.println("\n"+element1+"\n");
			 		if(!element1.equals(abc))
			 		{
			 				//System.out.println("\n" + link);
			 				Document doc=Jsoup.connect(element1).get();
			 				Element col=doc.getElementById("colors");
			 				System.out.println("\n Colors variant:"+col.text());
			 				int j=0;
			 				while(true) {		 					
			 					Elements td=doc.getElementsByClass("specsDetailsHolder");
			 					Element bytag=td.select("table").get(j);
			 					Element bylast=td.select("table").last();	
			 					Element last=bytag.select("td").last();
			 					int i=1;
			 					while(true) 
			 					{
			 						Element tag=bytag.select("td").get(i);
			 						System.out.println(tag.text());
			 						i=i+2;
			 						if(last==tag)
			 						{
			 							
			 							break;
			 						}
			 					}
			 					
			 					if(bytag==bylast)
			 					{
			 						break;
			 					}
			 					j++;
			 				}
			 			}
			 		}
		 	}
			catch(IOException e) 
			{
		 		e.printStackTrace();
		 	}
	}

}
