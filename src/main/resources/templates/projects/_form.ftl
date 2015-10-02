<div class="form-group">
    <label for="title" class="col-sm-2 control-label">Name</label>
    <div class="col-sm-10">
    <@spring.formInput "project.name",  "class='form-control'" />
    </div>
</div>
<div class="form-group">
    <label for="summary" class="col-sm-2 control-label">Description</label>
    <div class="col-sm-10">
    <@spring.formTextarea "project.description",  "class='form-control'" />
    </div>
</div>
<div class="form-group">
    <label for="summary" class="col-sm-2 control-label">Category</label>
    <div class="col-sm-10">
    <@spring.formSingleSelect "project.categoryId", categoriesMap, "class='form-control'" />
    </div>
</div>
<div class="form-group">
    <label for="title" class="col-sm-2 control-label">Website URL</label>
    <div class="col-sm-10">
    <@spring.formInput "project.websiteUrl",  "class='form-control'" />
    </div>
</div>
<div class="form-group">
    <label for="title" class="col-sm-2 control-label">Sourcecode URL</label>
    <div class="col-sm-10">
    <@spring.formInput "project.sourcecodeUrl",  "class='form-control'" />
    </div>
</div>
<div class="form-group">
    <label for="title" class="col-sm-2 control-label">Issues URL</label>
    <div class="col-sm-10">
    <@spring.formInput "project.issuesUrl",  "class='form-control'" />
    </div>
</div>
<div class="form-group">
    <label for="title" class="col-sm-2 control-label">groupId</label>
    <div class="col-sm-10">
    <@spring.formInput "project.groupId",  "class='form-control'" />
    </div>
</div>
<div class="form-group">
    <label for="title" class="col-sm-2 control-label">artifactId</label>
    <div class="col-sm-10">
    <@spring.formInput "project.artifactId",  "class='form-control'" />
    </div>
</div>