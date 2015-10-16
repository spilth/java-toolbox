<@main title="Groups and Categories">

<#list groups as group>
    <#if group.categories?has_content>
                <h2>${group.name}</h2>
                <#list group.categories as category>
                    <#if category.projects?has_content>
                        <h3><a href="/categories/${category.id}">${category.name}</a></h3>
                    </#if>
                </#list>
    </#if>
</#list>


</@main>
