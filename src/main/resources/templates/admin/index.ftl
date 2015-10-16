<@admin title="Admin">
    <h1>Admin</h1>

    <table class="table">
        <thead>
            <tr>
                <th>Group</th>
                <th>Category</th>
                <th>Project</th>
            </tr>
        </thead>
        <tbody>

        <#list groups as group>
            <tr>
                <td><a href="/groups/${group.id}">${group.name}</a></td>
                <td></td>
                <td></td>
                <td><a href="/groups/${group.id}/new">Edit</a></td>
            </tr>
            <#if group.categories?has_content>
                <#list group.categories as category>
                     <tr>
                         <td>-</td>
                         <td><a href="/categories/${category.id}">${category.name}</a></td>
                         <td></td>
                         <td><a href="/categories/${category.id}/edit">Edit</a></td>
                     </tr>
                    <#if category.projects?has_content>
                        <#list category.projects as project>
                        <tr>
                            <td>-</td>
                            <td>-</td>
                            <td><a href="/projects/${project.id}">${project.name}</a></td>
                            <td><a href="/projects/${project.id}/edit">Edit</a></td>
                        </tr>
                        </#list>
                    </#if>
                </#list>
            </#if>
        </#list>
        </tbody>
    </table>

</@admin>
