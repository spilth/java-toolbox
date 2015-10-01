<@main title="${category.name}">
    <h1>${category.name}</h1>

    <dl>
    <#list category.projects as project>
        <dt><a href="/projects/${project.id}">${project.name}</a></dt>
        <dd>${project.description}</dd>
    </#list>
    </dl>

</@main>

