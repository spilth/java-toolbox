<#macro main title="The Java Toolbox">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags-->
    <title>${title} - The Java Toolbox</title>
    <link rel="stylesheet" href="/webjars/bootswatch-slate/3.3.1+2/css/bootstrap.min.css">
    <script src="/webjars/jquery/2.1.4/jquery.min.js"></script>
    <script src="/webjars/bootswatch-slate/3.3.1+2/js/bootstrap.min.js"></script>
    <style>
        html {
            position: relative;
            min-height: 100%;
        }

        body {
            margin-bottom: 80px;
        }

        body > .container {
            padding: 45px 15px 0;
        }

        .footer {
            position: absolute;
            bottom: 0;
            width: 100%;
            /* Set the fixed height of the footer here */
            height: 60px;
        }

        .footer-center {
            text-align: center;
        }

        .footer-right {
            text-align: right;
        }

        .footer > .container {
            padding-right: 15px;
            padding-left: 15px;
        }
    </style>
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
                <li><a href="/categories" id="categories">Categories</a></li>
                <li><a href="/" id="projects">Projects</a></li>
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