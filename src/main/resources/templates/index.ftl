<@main title="Projects by Category">
<h1>Projects by Category</h1>

<#list categories as category>
    <#if category.getProjects()?has_content>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h2 class="panel-title"><a href="/categories/${category.id}">${category.name}</a></h2>
            </div>
            <div class="panel-body">
                <dl>
                    <#list category.projects as project>
                        <dt><a href="/projects/${project.id}">${project.name}</a></dt>
                        <dd>${project.description}</dd>
                    </#list>
                </dl>
            </div>
        </div>
    </#if>
</#list>

</@main>
