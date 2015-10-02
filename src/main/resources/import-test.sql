INSERT INTO categories (
  id, name
) VALUES (
  1, 'HTML and Markup'
), (
  2, 'CSS'
);

INSERT INTO project (
  id, category_id, name, description
) VALUES (
  1, 1, 'pegdown', 'A pure-Java Markdown processor based on a parboiled PEG parser supporting a number of extensions'
), (
  2, 1, 'PDFBox', 'The Apache PDFBox™ library is an open source Java tool for working with PDF documents. This project allows creation of new PDF documents, manipulation of existing documents and the ability to extract content from documents.'
);
