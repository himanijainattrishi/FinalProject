<%@include file="Header.jsp"%>

<div>

<div class="wrapper">
    <form class="form-signin" action="login" method="post" command="user/add">       
      <h2 class="form-signin-heading">Please login</h2>
      <input type="text" class="form-control" name="userid" placeholder="Email Address" required="" autofocus="" />
      <input type="password" class="form-control" name="password" placeholder="Password" required=""/>      
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      </label>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
    </form>
  </div>
  </div>
  


  
  <%@include file="Footer.jsp"%>
  
  
    