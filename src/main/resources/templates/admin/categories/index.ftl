<@main title="Admin - Categories">
<h1>Admin - Categories</h1>

<div class="btn-group" role="group" aria-label="...">
    <a href="/admin/groups/" class="btn btn-default">Groups</a>
    <a href="/admin/categories/" class="btn btn-default">Categories</a>
    <a href="/admin/projects/" class="btn btn-default">Projects</a>
</div>

<table class="table">
    <thead>
    <tr>
        <th>Name</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
        <#list categories as category>
        <tr>
            <td><a href="/categories/${category.id}">${category.name}</a></td>
            <td><a href="/admin/categories/${category.id}/edit">Edit</a></td>
        </tr>
        </#list>
    </tbody>
</table>
</@main>
