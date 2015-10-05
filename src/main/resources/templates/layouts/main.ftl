<#macro main title="The Java Toolbox">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags-->
    <title>${title} - The Java Toolbox</title>
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
                <li><a href="/" id="projects">Projects</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/projects/new">Submit A Project</a></li>
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

</body>
</html>

</#macro>