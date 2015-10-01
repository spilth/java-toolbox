<@main title="Categories">
<h1>Categories</h1>

<#list categories as category>
    <h2><a href="/categories/${category.id}">${category.name}</a></h2>

    <dl>
        <#list category.projects as project>
            <dt><a href="/projects/${project.id}">${project.name}</a></dt>
            <dd>${project.description}</dd>
        </#list>
    </dl>
</#list>

</@main>
