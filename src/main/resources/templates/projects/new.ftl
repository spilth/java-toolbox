<@main title="New Project">
    <h1>New Project</h1>

    <form action="/admin/projects" method="POST" class="form-horizontal">
        <#include "_form.ftl">
        <div class="form-group">
            <label for="title" class="col-sm-2 control-label">Enabled</label>
            <div class="col-sm-10">
                <@spring.formCheckbox "project.enabled",  "class='form-control'" />
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="Create Project" class="btn btn-primary" />
            </div>
        </div>
    </form>
</@main>
