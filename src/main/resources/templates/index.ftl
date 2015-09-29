<@main title="Home">
    <h2>Projects</h2>
    <ul>
    <#list projects as project>
        <li><a href="/projects/${project.id}">${project.name}</a> - ${project.description}</li>
    </#list>
    </ul>
</@main>
