<@main title="${project.name}">
    <h1>${project.name}</h1>

    <p>${project.description}</p>

    <#if project.websiteUrl?has_content >
        <a type="button" class="btn btn-info" href="${project.websiteUrl}">Website</a>
    </#if>
    <#if project.sourcecodeUrl?has_content >
        <a type="button" class="btn btn-info" href="${project.sourcecodeUrl}">Source Code</a>
    </#if>
    <#if project.issuesUrl?has_content >
        <a type="button" class="btn btn-info" href="${project.issuesUrl}">Bug Tracker</a>
    </#if>
</@main>

