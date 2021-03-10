# Json Implementation Stub
----------
Edit this stub to describe your Json implementation. Save along with any other results and artifacts.
## Experimentation plans: reuse of CityGML in related domains via JSON encodings.
SURROUND Australia is exploring methodologies to map conceptual models to implementations, focussed on OGC API. 
The experiment scope will be either extension of CityGML or mapping a related domain model to some relevant subset of CityGML. Either way, the modularity of the implementation approach is the key issue to explore.
The logical plan of action here is to support JSON through a combination of JSON schema and JSON-LD. The JSON-LD will be handled by attaching context documents to a JSON schema that matches UML class (aka FeatureType, frame, shape etc)) - rather than one of the many alternative forms of RDF-like JSON-LD. The context documents will be derived automatically from OWL derived from the UML. A number of different approaches for this UML->OWL encoding exist, the interoperability of these need to be explored. If there are plans within the CityGML to to support an RDF encoding option then the canonical OWL encoding would be used, otherwise a candidate derived. Collaborators welcome :-).
