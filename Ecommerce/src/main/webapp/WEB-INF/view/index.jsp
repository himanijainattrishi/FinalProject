<%@include file="Header.jsp"%>
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" interval="1000">
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner" role="listbox">
    <div class="carousel-item active">
     <a href="product"><img src="resource/images/image10.jpg" alt="..."></a>
    </div>
    <div class="carousel-item">
     <a href="product"><img src="resource/images/image11.jpg" alt="..."></a>
    </div>
    <div class="carousel-item">
     <a href="product"><img src="resource/images/image12.jpg" alt="..."></a>
    </div>
  </div>
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="icon-prev" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="icon-next" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

<%--images thumbnail start --%>

 <div class="row">
 <div class="col-sm-1"></div>
 <div class="col-md-3">
  
    <a href="${session.getContextPath()}/Ecommerce/product/Eye" >
      <p>EYES MAKEUP INSPRIAION SIGNATURE LOOKS SIMPLIFIED!!!!!!!!!</p>
      <img src="resource/images/Eye.jpg"  class="img-responsive" alt="Pulpit Rock" style="width:150px;height:150px">
    </a>
  </div>
  

  <div class="col-md-3">
    <a href="${session.getContextPath()}/Ecommerce/product/Lips" >
      <p>TIMELESS MATTES AND GLOSSES ENDLESS SHADES TO FALL IN LOVE WITH!!!!!!!</p>
      <img src="resource/images/lips.jpg" class="img-responsive" alt="Moustiers Sainte Marie" style="width:200px;height:150px">
    </a>
  </div>
  
  
  <div class="col-md-3">
    <a href="${session.getContextPath()}/Ecommerce/product/Face" >
      <p>COMPACT FINAL TOUCH TIPS</p>
      <img src="resource/images/face1.jpg" class="img-responsive" alt="Cinque Terre" style="width:300px;height:150px">
    </a>
  </div>
  
   <div class="col-md-2">
    <a href="${session.getContextPath()}/Ecommerce/product/Face" >
      <p>COMPACT FINAL TOUCH TIPS</p>
      <img src="resource/images/face3.jpg" class="img-responsive" alt="Cinque Terre" style="width:150px;height:150px">
    </a>
  </div>
  
</div> 

<!-- <div class="container">
<div class="row">
<div class="col-sm-4"> 
<img src="resource/images/face1.jpg" alt="Cinque Terre" style="width:150px;height:150px">
</div>
<div class="col-sm-4"> 
<img src="resource/images/face1.jpg" alt="Cinque Terre" style="width:150px;height:150px">
</div>
<div class="col-sm-4"> 
<img src="resource/images/face1.jpg" alt="Cinque Terre" style="width:150px;height:150px">
</div>

</div>


</div> -->









<%--div Row end --%>
 <div class="row">
<div class=col-sm-12">
<a href="product"><img src="resource/images/sale.jpg"></a></div></div>





 <div class="row">
<div class="col-sm-2"></div>
<div class="col-sm-2"><a href="${session.getContextPath()}/Ecommerce/product" ><img src="resource/images/product2.jpg" alt="Cinque Terre" style="width:150px;height:150px">
</a></div>
<div class="col-sm-2"><a href="${session.getContextPath()}/Ecommerce/product/Lips" ><img src="resource/images/product3.jpg" alt="Cinque Terre" style="width:150px;height:150px">
</a></div>
<div class="col-sm-2"><a href="${session.getContextPath()}/Ecommerce/product/Eye" ><img src="resource/images/image7.jpg" alt="Cinque Terre" style="width:150px;height:150px">
</a></div>
<div class="col-sm-2"><a href="${session.getContextPath()}/Ecommerce/product/Lips" ><img src="resource/images/images13.jpg" alt="Cinque Terre" style="width:150px;height:150px">
</a></div>
<div class="col-sm-2"><a href="${session.getContextPath()}/Ecommerce/product/Lips" ><img src="resource/images/image4.jpg" alt="Cinque Terre" style="width:150px;height:150px">
<a></a></div>
</div> 





 <!-- Carousel -->




<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 <script src="resource/bootstrap/js/bootstrap.min.js"></script>
 -->

<%@include file="Footer.jsp" %>

<!-- </div> -->



  
 

  

