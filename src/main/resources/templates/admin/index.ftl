<@main title="Admin">
    <h1>Admin</h1>


    <p><a href="/admin/projects/new" class="btn btn-primary">New Project</a></p>
    <p><a href="/admin/categories/new" class="btn btn-primary">New Category</a></p>

    <table class="table">
        <thead>
            <tr>
                <th>Name</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <#list projects as project>
            <tr>
                <td><a href="/projects/${project.id}">${project.name}</a></td>
                <td><a href="/admin/projects/${project.id}/edit" class="btn">Edit</a></td>
            </tr>
            </#list>
        </tbody>
    </table>
</@main>
