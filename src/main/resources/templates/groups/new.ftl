<@main title="New Group">
    <h1>New Group</h1>

    <form action="/admin/groups" method="POST" class="form-horizontal">
        <#include "_form.ftl">
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="Create Group" class="btn btn-primary" />
            </div>
        </div>
    </form>
</@main>
