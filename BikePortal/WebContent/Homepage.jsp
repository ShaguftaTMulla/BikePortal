<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>



<body text="white">

<style>

* {box-sizing: border-box;}

body 
{
	  background-image: url("https://www.hdwallpapers.in/walls/2014_bmw_s1000r-wide.jpg");
	    background-repeat: repeat-x;
  margin: 0;
  font-family: Arial;
}


.topnav 
{
  overflow: hidden;
  background-color: #424242;

	    
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #689F38;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

.topnav .search-container {
  float: right;
}

.topnav input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.topnav .search-container button {
  float: right;
  padding: 6px 10px;
  margin-top: 8px;
  margin-right: 16px;
  background: #ddd;
  font-size: 17px;
  border: none;
  cursor: pointer;
}

.topnav .search-container button:hover {
  background: #ccc;
}

@media screen and (max-width: 600px) {
  .topnav .search-container {
    float: none;
  }
  .topnav a, .topnav input[type=text], .topnav .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
}

.serif {
    font-family: "Times New Roman", Times, serif;
    
}


div {
    height: 50px;
    width: 100%;
    
}


.alignRight{
 text-align: center;
 width:300px; float:left";
}


p.ex1 {
    margin-top: 2cm;
    bgcolor:#00BCD4;
}

.marginAlignTableHome
{
	 
	margin-top: 20px;
    margin-left: 100px;
    border-radius: 5px;
    padding: 22px 24px 24px;
    height: 250px;
    opacity: 0.8;
}

.roundedCorner{
    border-radius: 25px;
    border: 2px solid #73AD21;
    padding: 20px; 
    width: 400px;
    height: 150px;    
}


.roundedCornerBikePhotos
{
	border-radius: 25px;
    border: 2px solid #73AD21;
    padding: 20px; 
    width: 800px;
    height: 150px;   
}

.roundedCornerBikeLogos
{
	border-radius: 25px;
    border: 2px solid #73AD21;
    padding: 20px; 
    width: 500px;
    height: 150px;
    
}

.marginAlignTableCategory
{
	 
	margin-top: 65px;
    margin-left: 120px;
    height: 10px;
}
.marginAlignTableBikePhotos
{
	margin-top: 20px;
	margin-bottom: 10px;
    margin-left: 10px;
    
    height: 130px;
    border: 10px;
    opacity:0.8;
}

.marginAlignTableBikeLogos
{
	margin-top: 30px;
	margin-bottom: 10px;
    margin-left: 10px;
    
    height: 300px;
    border: 10px;
    opacity:1.0;
}



.optionBikeFont {
background-color:#37474F;
font-family:arial; 
color:#FFFFFF;
font-size:18px;
font-weight:bold;}

.optionBikeFontModel {
background-color:#616161;
font-family:arial; 
color:#FFFFFF;
font-size:16px;
font-weight:bold;}

.optionBikeFontPrice {
background-color:#616161;
font-family:arial; 
color:#FFFFFF;
font-size:16px;
font-weight:bold;}


.bgimg {
    background-image:(http://www.wallpapersbyte.com/wp-content/uploads/2017/02/Ducati-Diavel-2017-Bike-4K-WallpapersByte-com-3840x2400.jpg);
    height: 200px; 
    width: 100px;
}
.marginAlignTableCategory1
{
	margin-top: 150px;
	
    margin-left: 120px;
    
    height: 50px;
    border: 10px;
}

.button {
  border-radius: 4px;
  background-color: #f4511e;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 16px;
  padding: 12px;
  width: 80px;
  cursor: pointer;
  margin: 1px;
}

.bikeComparisonHeading
{
	margin-top: 30px;
	
    margin-left: 120px;
    color: #000000;
    height: 50px;
    border: 10px;
}


</style>

<body>

<div class="topnav">

<table align="center" >
   <tr>
   		<td><a class="serif" style="color:white;" href="home.jsp"><b>EVERYTHING ABOUT BIKES</b></a>
 </td>
  		<td><a style="color:white;" href="#about"><b>ABOUT</b></a></td>
  		<td><a style="color:white;" href="#contact"><b>CONTACT</b></a></td>
  		<td><div class="search-container"></td>
    	<td><form action="/action_page.php"></td>
      	<td><input type="text" placeholder="Search.." name="search"></td>
      	<td><input type="submit" class="button" value="SUBMIT"></td>
  </tr>
  </table>
</div>

<div class="topnav" align="center">
<table align="center" >
   <tr>
   <td><a style="color:white;" href="BIKES"><b>BIKES</b></a></td>
     <td><a style="color:white;" href="COMPARE"><b>COMPARE</b></a></td>
      <td><a style="color:white;" href="addNews.jsp"><b>NEWS AND REVIEWS</b></a></td>
     <td><a style="color:white;" href="WRITE A REVIEW"><b>WRITE A REVIEW</b></a></td>
     
   </tr>   
</table>
 
</div>
<div></div>

</body>

<body>
<div class="marginAlignTableHome">
	<table  class="roundedCorner" style="color:black;" style="border:1px solid white;" bgcolor="#FFFFFF" width="400"  >
			<tr align="center"><td><h2>SEARCH YOUR RIGHT BIKE</h2></td></tr>
			<tr align="center"><td>
					<select class="optionBikeFont">
							<option style="font-weight:bold">By Brand</option>
							<option value="Royale Enfield">Royale Enfield</option>
							<option value="Yamaha">Yamaha</option>
							<option  value="Honda">Honda</option>
							<option  value="Hero">Hero</option>
							<option  value="Bajaj">Bajaj</option>
					</select>
					<select class="optionBikeFont">
							<option>By Type</option>
							<option value="Super Bikes">Super Bikes</option>
							<option value="Sports Bikes">Sports Bikes</option>
							<option value="Cruiser Bikes">Cruiser Bikes</option>
							<option value="Scooter">Scooter</option>
							<option value="Best Mileage Bikes">Best Mileage Bikes</option>
							</select>
			</td>
			</tr>
			<tr>
			<td colspan="2">
				<table align="center">
				<tr>
				<th>
					<b><select class="optionBikeFontModel">
							<option>Model</option>
							<option value="Fazer">Super Bikes</option>
							<option value="Sports Bikes">Sports Bikes</option>
							<option value="Cruiser Bikes">Cruiser Bikes</option>
							<option value="Scooter">Scooter</option>
							<option value="Best Mileage Bikes">Best Mileage Bikes</option>
							</select>
					</b>
				</th>
				</tr>
				<tr>
				<th>
					<select class="optionBikeFontPrice">
							<option>Price</option>
							<option value="">Super Bikes</option>
							<option value="Sports Bikes">Sports Bikes</option>
							<option value="Cruiser Bikes">Cruiser Bikes</option>
							<option value="Scooter">Scooter</option>
							<option value="Best Mileage Bikes">Best Mileage Bikes</option>
							</select>
					
				</th>
				</tr>
				</table>
				</td>
			</tr>
			<tr>
			<td align="center" colspan="2">
			<input type="button" class="button" value="Search">
			</td>
			</tr>
	</table>
	
</div>


<div>

	<div class="marginAlignTableCategory">
		<h3 >Popular Bikes By Category</h3>
	</div>
	<div>
		<table align="center" cellspacing="40" >
		<tr>
			<td>Best Mileage Bikes</td>
			<td>Sports Bike</td>
			<td>Cruising Bikes</td>
			
		</tr>
		</table>
	</div>



</div>

<div class="marginAlignTableBikePhotos">
<table align="center" cellspacing="35" border="5 px solid black" class="roundedCornerBikePhotos" bgcolor="#FFFFFF">
 <tr>
 <td class="marginAlignTableBikePhotos"><img src="https://media.zigcdn.com/media/model/2016/Feb/heromotocorp_splendorplus_600x300.jpg" height="107" width="100%"></td>
 <td class="marginAlignTableBikePhotos"><img src="https://bd.gaadicdn.com/processedimages/ducati/diavel-diesel/640X309/diavel-diesel-limited-edition_black.jpg" height="107" width="100%"></td>
 <td class="marginAlignTableBikePhotos"><img src="https://media.zigcdn.com/media/model/2018/Jan/kawasaki-vulcan-s-right-view_600x300.jpg" height="107" width="100%"></td>
 

 </tr>
 </table>
</div>
<div class="marginAlignTableCategory1">
<h3>Popular Bike Brands in India</h3><br />
</div>


<div class="marginAlignTableBikeLogos">
<table align="center" cellspacing="35" border="5 px solid black" class="roundedCornerBikeLogos">
	<tr>
		
		
		<td><a href="https://www.heromotocorp.com/en-in/">
 		 	<img src="https://motorcycle-logos.com/wp-content/uploads/2016/11/Hero-logo.png"  style="width:100px;height:100px;border:0">
			</a>
		</td>
		
		<td><a href="https://www.honda2wheelersindia.com/">
  			<img src="https://vignette2.wikia.nocookie.net/logopedia/images/8/89/Honda_Motorcycle.png/revision/latest/scale-to-width-down/2000?cb=20120821141317"  style="width:100px;height:100px;border:0">
			</a>
		</td>
		
		<td><a href="https://www.bajajauto.com/">
  			<img src="https://seeklogo.com/images/B/bajaj-logo-581A18EFC1-seeklogo.com.png"  style="width:100px;height:100px;border:0">
			</a>
		</td>
		
		<td><a href="https://royalenfield.com/">
 		 	<img src="https://royalenfield.com/newstripes/images/re_logo.png"  style="width:100px;height:100px;border:0">
			</a>
		</td>
		
		<td><a href="http://www.yamaha-motor-india.com/">
  			<img src="https://www.yamaha.com/en/about/history/logo/images/logo_yamaha_motor.gif"  style="width:100px;height:100px;border:0">
			</a>
		</td>
		
		
		
		<td><a href="https://www.tvsmotor.com/">
  			<img src="https://botw-pd.s3.amazonaws.com/styles/logo-thumbnail/s3/0015/2081/brand.gif?itok=0YnOsRYK"  style="width:100px;height:100px;border:0">
			</a>
		</td>

</tr>

	

</table>
</div>
</body>

<body>

<div class="bikeComparisonHeading"><h3><b>POPULAR BIKE COMPARISONS</b></h3></div>

</body>

</html>
