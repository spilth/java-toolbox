<@main title="Groups and Categories">
<h1>Groups and Categories</h1>

<#list groups as group>
    <div class="panel panel-default">
        <div class="panel-heading">
            <h2 class="panel-title">${group.name}</h2>
        </div>
        <div class="panel-body">
            <dl>
                <#list group.categories as category>
                    <dt><a href="/categories/${category.id}">${category.name}</a></dt>
                </#list>
            </dl>
        </div>
    </div>
</#list>


</@main>
