<@main title="${project.name}">
    <h1>${project.name}</h1>

    <p>${project.description}</p>

    <#if project.websiteUrl?? >
        <a type="button" class="btn btn-info" href="${project.websiteUrl}">Website</a>
    </#if>
    <#if project.sourcecodeUrl?? >
        <a type="button" class="btn btn-info" href="${project.sourcecodeUrl}">Source Code</a>
    </#if>
    <#if project.issuesUrl?? >
        <a type="button" class="btn btn-info" href="${project.issuesUrl}">Bug Tracker</a>
    </#if>
</@main>

