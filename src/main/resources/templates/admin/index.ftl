<@main title="Admin">
    <h1>Admin</h1>

    <div class="btn-group" role="group" aria-label="...">
        <a href="/admin/groups/new" class="btn btn-default">New Group</a>
        <a href="/admin/categories/new" class="btn btn-default">New Category</a>
        <a href="/admin/projects/new" class="btn btn-default">New Project</a>
    </div>

    <table class="table">
        <thead>
            <tr>
                <th>Name</th>
                <th>Enabled</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <#list projects as project>
            <tr>
                <td><a href="/projects/${project.id}">${project.name}</a></td>
                <td>${project.enabled?string("Yes", "No")}</td>
                <td><a href="/admin/projects/${project.id}/edit" class="btn">Edit</a></td>
            </tr>
            </#list>
        </tbody>
    </table>
</@main>
