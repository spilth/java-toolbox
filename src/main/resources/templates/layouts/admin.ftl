<#macro admin title="The Java Toolbox">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags-->
    <title>${title} - Admin</title>
    <link rel="stylesheet" href="/webjars/bootswatch-yeti/3.3.1+2/css/bootstrap.min.css">
    <link rel='stylesheet' href='/stylesheets/java-toolbox.css'>
    <script src="/webjars/jquery/2.1.4/jquery.min.js"></script>
    <script src="/webjars/bootswatch-yeti/3.3.1+2/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header"><a href="/" class="navbar-brand">The Java Toolbox</a>
            <button type="button" data-toggle="collapse" data-target="#navbar" aria-expanded="false"
                    aria-controls="navbar" class="navbar-toggle collapsed"><span
                    class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span
                    class="icon-bar"></span></button>
        </div>

        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="/admin/">Admin</a></li>
                <li><a href="/admin/groups/">Groups</a></li>
                <li><a href="/admin/categories/">Categories</a></li>
                <li><a href="/admin/projects/">Projects</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/admin/groups/new">New Group</a></li>
                <li><a href="/admin/categories/new">New Category</a></li>
                <li><a href="/admin/projects/new">New Project</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="starter-template">
        <#nested>
    </div>
</div>

<footer class="footer">
    <div class="container">
        <div class="row text-muted">
            <div class="col-md-4 col-sm-4 footer-left">
                <a href="https://github.com/TheJavaToolbox/java-toolbox">Website Source Code</a>
            </div>
            <div class="col-md-4 col-sm-4 footer-center">
                &copy; 2015 The Java Toolbox
            </div>
            <div class="col-md-4 col-sm-4 footer-right">
                Hosted on <a href="https://run.pivotal.io">Pivotal Web Services</a>
            </div>
        </div>
    </div>
</footer>

<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-68465931-1', 'auto');
  ga('send', 'pageview');

</script>

</body>
</html>

</#macro>
