<%@include file="Header.jsp"%>

<!-- <div> -->

<!-- <div class="wrapper"> -->
<!-- <div class="container">
    <form class="form-signin" action="login" method="post" command="user/add">       
      <h2 class="form-signin-heading">Please login</h2>
      <input type="text" class="form-control" name="userid" placeholder="Email Address" required="" autofocus=""  />
      <input type="password" class="form-control" name="password" placeholder="Password" required=""/>      
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      </label>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
    </form>
  </div>
  </div> -->
  
 <div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-7">
            <div class="panel panel-default">
                <div class="panel-heading"> <strong class="">Login</strong>

                </div>
                <div class="panel-body">
                    <form class="form-signin" action="login" method="post" command="user/add">   
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-3 control-label">Email</label>
                            <div class="col-sm-9">
                              <input type="text" class="form-control" name="userid" placeholder="Email Address" required="" autofocus=""  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Password</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" name="password" placeholder="Password" required=""/> 
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-9">
                                <div class="checkbox">
                                    <label class="">
                                        <input type="checkbox" class="">Remember me</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group last">
                            <div class="col-sm-offset-3 col-sm-9">
                                <button type="submit" class="btn btn-success btn-sm">Sign in</button>
                                <button type="reset" class="btn btn-default btn-sm">Reset</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="panel-footer">Not Registered? <a href="register" class="">Register here</a>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container">
<div class="row">
<div class="col-sm-12"></div></div>
  
  
  </div>
  <br><br><br><br>
  


  
  <%@include file="Footer.jsp"%>
  
  
    