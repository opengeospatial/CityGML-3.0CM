The EA file `CityGML_UML_Profile.eap` defines the UML profile that was used for creating the CityGML 3.0 UML model.
The UML profile is based on the ISO standards 19103, 19109, and 19136 that define stereotypes such as &#171;ApplicationSchema&#187;, &#171;FeatureType&#187;, or &#171;CodeList&#187; including tagged values. In addition, the UML profile defines the CityGML-specific stereotypes &#171;TopLevelFeatureType&#187; and &#171;Version&#187;.

The UML profile was imported into the CityGML 3.0 EA project as MDG Technology (https://sparxsystems.com.au/enterprise_architect_user_guide/15.2/modeling/mdg_technologies.html). In this way, a CityGML-specific Toolbox becomes available that provides the stereotypes as individual model elements including the predefined tagged values. These model elements were used for creating the CityGML UML model.
In the same way, the Toolbox can also be used later on for defining CityGML Application Domain Extensions (ADEs).

The UML profile and the MDG technology are provided in this folder.

The following steps describe how to import the UML profile as MDG Technology. The explanations refer to EA version 13.<br>
Steps 1) and 2) describe how to create the MDG Technology yourself from the UML profile.<br>
Step 3) explains how to import the MDG Technology. You can skip steps 1) and 2) by simply importing the file `CityGML_MDG_Technology.xml` in step 3).

**1) Export the UML profile**
- Open the EA project `CityGML_UML_Profile.eap`
- In the Project Browser -> Right-click on "&#171;profile&#187; CityGML" -> Go to "Advanced" -> Click on "Save Package as UML Profile"
- Keep or change the settings as required and click "Save" to save the UML profile as XML file

-> The result of this step is provided here as file `CityGML_UML_Profile.xml`

**2) Generate an MDG Technology / Update an existing MDG Technology**

**Steps to follow when generating an MDG Technology from the UML profile**<br>
-> This step creates two files: An MDG Technology file (file extension .xml) and an MDG Technology Selection file (file extension .mts)

- Go to the tab "Publish" -> Field "Technology" -> Click on "Publish" -> Click on "Generate MDG Technology" -> Click on "Next"
- Select "Create a new MTS file" -> "Next"
- Chose a name and path for the MTS file to be saved -> "Next"
- Fill in the empty fields to decribe the MTS technology -> "Next"
- Select "Metamodel: Profiles" -> "Next"
- Select the folder that contains the XML file of the CityGML UML profile exported in step 1) and move the file to "Selected Files" -> "Next" -> "Finish"

**Steps to follow when updating an existing MDG Technology e.g. after the UML profile has been changed**<br>
-> This step updates the MDG Technology file (file extension .xml)

- Go to the tab "Publish" -> Field "Technology" -> Click on "Publish" -> Click on "Generate MDG Technology" -> Click on "Next"
- Select "Open an existing MTS file" -> Select the existing mts file -> Simply click on "Next" in all the following windows (or adapt settings if you require) and then "Finish"

-> The result of this step is provided here as files `CityGML_MDG_Technology.xml` and `CityGML_MDG_Technology.mts`

**3) Import MDG Technology into your EA project**
- Open the EA project that is to make use of the UML profile
- Go to the tab "Publish" -> Field "Technology" -> Click on "Publish" -> Click on "Import MDG Technology"
- Select the MDG Technology file created or updated in step 2) (here: `CityGML_MDG_Technology.xml`) -> Click on "OK"
- In the Toolbox window, you can now select the CityGML Toolbox via "More tools..."
