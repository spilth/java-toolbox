<@admin title="Projects">
    <h1>Projects</h1>

    <div class="btn-group" role="group" aria-label="...">
        <a href="/admin/groups/" class="btn btn-default">Groups</a>
        <a href="/admin/categories/" class="btn btn-default">Categories</a>
        <a href="/admin/projects/" class="btn btn-default">Projects</a>
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
                <td>${project.enabled?c}</td>
                <td><a href="/admin/projects/${project.id}/edit">Edit</a></td>
            </tr>
            </#list>
        </tbody>
    </table>
</@admin>
