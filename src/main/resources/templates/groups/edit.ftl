<@main title="New Group">
    <h1>Edit Group</h1>

    <form action="/admin/groups/${group.id}" method="POST" class="form-horizontal">
        <input type="hidden" name="_method" value="PUT" />
        <#include "_form.ftl">
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="Update Group" class="btn btn-primary" />
            </div>
        </div>
    </form>
</@main>
