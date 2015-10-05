<@main title="Edit Project">
    <h1>Edit Project</h1>

    <form action="/admin/projects/${project.id}" method="POST" class="form-horizontal">
        <input type="hidden" name="_method" value="PUT" />
        <#include "_form.ftl">
        <div class="form-group">
            <label for="title" class="col-sm-2 control-label">Enabled</label>
            <div class="col-sm-10">
                <@spring.formCheckbox "project.enabled",  "class='form-control'" />
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="Update Project" class="btn btn-primary" />
            </div>
        </div>
    </form>
</@main>
