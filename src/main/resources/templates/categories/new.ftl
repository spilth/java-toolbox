<@main title="New Category">
    <h1>New Category</h1>

    <form action="/admin/categories" method="POST" class="form-horizontal">
        <#include "_form.ftl">
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="Create Category" class="btn btn-primary" />
            </div>
        </div>
    </form>
</@main>
