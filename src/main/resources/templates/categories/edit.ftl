<@main title="New Category">
    <h1>Edit Category</h1>

    <form action="/admin/categories/${category.id}" method="POST" class="form-horizontal">
        <input type="hidden" name="_method" value="PUT" />
        <#include "_form.ftl">
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="Update Category" class="btn btn-primary" />
            </div>
        </div>
    </form>
</@main>
