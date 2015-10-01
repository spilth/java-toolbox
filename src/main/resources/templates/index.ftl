<@main title="Home">
    <h1>Projects</h1>
    <ul>
    <#list projects as project>
        <li><a href="/projects/${project.id}">${project.name}</a> - ${project.description}</li>
    </#list>
    </ul>
</@main>
