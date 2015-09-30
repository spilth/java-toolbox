<@main title="New Project">
    <h1>New Project</h1>

    <form action="/admin/projects" method="POST" class="form-horizontal">

        <div class="form-group">
            <label for="title" class="col-sm-2 control-label">Name</label>
            <div class="col-sm-10">
                <input id="name" name="name" type="text" class="form-control" />
            </div>
        </div>
        <div class="form-group">
            <label for="summary" class="col-sm-2 control-label">Description</label>
            <div class="col-sm-10">
                <textarea id="description" name="description" class="form-control"></textarea>
            </div>
        </div>
        <div class="form-group">
            <label for="title" class="col-sm-2 control-label">Website URL</label>
            <div class="col-sm-10">
                <input id="websiteUrl" name="websiteUrl" type="text" class="form-control" />
            </div>
        </div>
        <div class="form-group">
            <label for="title" class="col-sm-2 control-label">Sourcecode URL</label>
            <div class="col-sm-10">
                <input id="sourcecodeUrl" name="sourcecodeUrl" type="text" class="form-control" />
            </div>
        </div>
        <div class="form-group">
            <label for="title" class="col-sm-2 control-label">Issues URL</label>
            <div class="col-sm-10">
                <input id="issuesUrl" name="issuesUrl" type="text" class="form-control" />
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="Create Project" class="btn btn-primary" />
            </div>
        </div>
    </form>
</@main>
