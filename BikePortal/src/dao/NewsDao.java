package dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import conn.MyConnection;
import dto.BikeNews;

public class NewsDao {

	private MyConnection mcon;
	public NewsDao()
	{
		mcon=new MyConnection();
	}
	
	public BikeNews news()
	{
		BikeNews newss =new BikeNews();
		try
		{
		
		Document  doc = Jsoup.connect("http://www.yamaha-motor-india.com/news-latest.html").get();

		Elements newsHeadlines=doc.select("div#news-carousel");
		Elements news1=newsHeadlines.select("div.news-item");
		Elements titles=news1.select("h2.title");
		Elements newsbox=news1.select("p");
			for(int i=0;i<5;i++)
			{
				Element news2=news1.select("a[href]").get(i);
				Element title=titles.select("h2.title").get(i);
				Element newsBoxx=newsbox.select("p").get(i);
		
				String ref="http://www.yamaha-motor-india.com/"+news2.attr("href");
				newss.setNewsHead(title.text());
				newss.setNewsBox(newsBoxx.text());
				newss.setNewsRef(ref);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return newss;
	}
	
	/*===============================================================================================*/
	public int addNews()
	{
		int j=0;
		BikeNews news=news();
		try {
			Connection con=mcon.getConn();
			
				
				PreparedStatement s=con.prepareStatement("insert into News(news_head,news_box,news_ref) values(?,?,?)");
				s.setString(1,news.getNewsHead());
				s.setString(2, news.getNewsBox());
				s.setString(3, news.getNewsRef());
				j=s.executeUpdate();
				con.close();
				
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		} 
		return j;
	}
	
	/*===============================================================================================*/
	
	public ArrayList<BikeNews> showNews()
	{
		ArrayList<BikeNews> list=new ArrayList<BikeNews>();
		try {
			Connection con=mcon.getConn();
			PreparedStatement ps=con.prepareStatement("select * from News");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				BikeNews news=new BikeNews();
				news.setNewsId(rs.getInt(1));
				news.setNewsHead(rs.getString(2));
				news.setNewsBox(rs.getString(3));
				news.setNewsRef(rs.getString(4));
				list.add(news);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}






