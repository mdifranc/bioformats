/*
 * ome.xml.r201004.Image
 *
 *-----------------------------------------------------------------------------
 *
 *  Copyright (C) 2010 Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee,
 *      University of Wisconsin-Madison
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *-----------------------------------------------------------------------------
 */

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by callan via xsd-fu on 2010-04-20 12:31:20+0100
 *
 *-----------------------------------------------------------------------------
 */

package ome.xml.r201004;

import java.util.ArrayList;
import java.util.List;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ome.xml.r201004.enums.*;

public class Image extends Object
{
	// -- Instance variables --

	// Property
	private String id;

	// Property
	private String name;

	// Property
	private String acquiredDate;

	// Property
	private Experimenter experimenter;

	// Property
	private String description;

	// Property
	private Experiment experiment;

	// Property
	private Group group;

	// Property which occurs more than once
	private List<Dataset> datasetList = new ArrayList<Dataset>();

	// Property
	private Instrument instrument;

	// Property
	private ObjectiveSettings objectiveSettings;

	// Property
	private ImagingEnvironment imagingEnvironment;

	// Property
	private StageLabel stageLabel;

	// Property
	private Pixels pixels;

	// Property which occurs more than once
	private List<ROI> roiList = new ArrayList<ROI>();

	// Property which occurs more than once
	private List<MicrobeamManipulation> microbeamManipulationList = new ArrayList<MicrobeamManipulation>();

	// Property which occurs more than once
	private List<Annotation> annotationList = new ArrayList<Annotation>();

	// Back reference WellSample_BackReference
	private List<WellSample> wellSample_BackReferenceList = new ArrayList<WellSample>();

	// -- Constructors --

	/** Constructs a Image. */
	public Image()
	{
	}

	// -- Image API methods --

	// Property
	public String getID()
	{
		return id;
	}

	public void setID(String id)
	{
		this.id = id;
	}

	// Property
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	// Property
	public String getAcquiredDate()
	{
		return acquiredDate;
	}

	public void setAcquiredDate(String acquiredDate)
	{
		this.acquiredDate = acquiredDate;
	}

	// Property
	public Experimenter getExperimenter()
	{
		return experimenter;
	}

	public void setExperimenter(Experimenter experimenter)
	{
		this.experimenter = experimenter;
	}

	// Property
	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	// Property
	public Experiment getExperiment()
	{
		return experiment;
	}

	public void setExperiment(Experiment experiment)
	{
		this.experiment = experiment;
	}

	// Property
	public Group getGroup()
	{
		return group;
	}

	public void setGroup(Group group)
	{
		this.group = group;
	}

	// Property which occurs more than once
	public int sizeOfDatasetList()
	{
		return datasetList.size();
	}

	public List<Dataset> copyDatasetList()
	{
		return new ArrayList<Dataset>(datasetList);
	}

	public Dataset getDataset(int index)
	{
		return datasetList.get(index);
	}

	public Dataset setDataset(int index, Dataset dataset)
	{
		return datasetList.set(index, dataset);
	}

	public void addDataset(Dataset dataset)
	{
		datasetList.add(dataset);
	}

	public void removeDataset(Dataset dataset)
	{
		datasetList.remove(dataset);
	}

	// Property
	public Instrument getInstrument()
	{
		return instrument;
	}

	public void setInstrument(Instrument instrument)
	{
		this.instrument = instrument;
	}

	// Property
	public ObjectiveSettings getObjectiveSettings()
	{
		return objectiveSettings;
	}

	public void setObjectiveSettings(ObjectiveSettings objectiveSettings)
	{
		this.objectiveSettings = objectiveSettings;
	}

	// Property
	public ImagingEnvironment getImagingEnvironment()
	{
		return imagingEnvironment;
	}

	public void setImagingEnvironment(ImagingEnvironment imagingEnvironment)
	{
		this.imagingEnvironment = imagingEnvironment;
	}

	// Property
	public StageLabel getStageLabel()
	{
		return stageLabel;
	}

	public void setStageLabel(StageLabel stageLabel)
	{
		this.stageLabel = stageLabel;
	}

	// Property
	public Pixels getPixels()
	{
		return pixels;
	}

	public void setPixels(Pixels pixels)
	{
		this.pixels = pixels;
	}

	// Property which occurs more than once
	public int sizeOfROIList()
	{
		return roiList.size();
	}

	public List<ROI> copyROIList()
	{
		return new ArrayList<ROI>(roiList);
	}

	public ROI getROI(int index)
	{
		return roiList.get(index);
	}

	public ROI setROI(int index, ROI roi)
	{
		return roiList.set(index, roi);
	}

	public void addROI(ROI roi)
	{
		roiList.add(roi);
	}

	public void removeROI(ROI roi)
	{
		roiList.remove(roi);
	}

	// Property which occurs more than once
	public int sizeOfMicrobeamManipulationList()
	{
		return microbeamManipulationList.size();
	}

	public List<MicrobeamManipulation> copyMicrobeamManipulationList()
	{
		return new ArrayList<MicrobeamManipulation>(microbeamManipulationList);
	}

	public MicrobeamManipulation getMicrobeamManipulation(int index)
	{
		return microbeamManipulationList.get(index);
	}

	public MicrobeamManipulation setMicrobeamManipulation(int index, MicrobeamManipulation microbeamManipulation)
	{
		return microbeamManipulationList.set(index, microbeamManipulation);
	}

	public void addMicrobeamManipulation(MicrobeamManipulation microbeamManipulation)
	{
		microbeamManipulationList.add(microbeamManipulation);
	}

	public void removeMicrobeamManipulation(MicrobeamManipulation microbeamManipulation)
	{
		microbeamManipulationList.remove(microbeamManipulation);
	}

	// Property which occurs more than once
	public int sizeOfAnnotationList()
	{
		return annotationList.size();
	}

	public List<Annotation> copyAnnotationList()
	{
		return new ArrayList<Annotation>(annotationList);
	}

	public Annotation getAnnotation(int index)
	{
		return annotationList.get(index);
	}

	public Annotation setAnnotation(int index, Annotation annotation)
	{
		return annotationList.set(index, annotation);
	}

	public void addAnnotation(Annotation annotation)
	{
		annotationList.add(annotation);
	}

	public void removeAnnotation(Annotation annotation)
	{
		annotationList.remove(annotation);
	}

	// Back reference WellSample_BackReference
	public int sizeOfLinkedWellSampleList()
	{
		return wellSample_BackReferenceList.size();
	}

	public List<WellSample> copyLinkedWellSampleList()
	{
		return new ArrayList<WellSample>(wellSample_BackReferenceList);
	}

	public WellSample getLinkedWellSample(int index)
	{
		return wellSample_BackReferenceList.get(index);
	}

	public WellSample setLinkedWellSample(int index, WellSample wellSample_BackReference)
	{
		return wellSample_BackReferenceList.set(index, wellSample_BackReference);
	}

	public void linkWellSample(WellSample wellSample_BackReference)
	{
		this.wellSample_BackReferenceList.add(wellSample_BackReference);
	}

	public void unlinkWellSample(WellSample wellSample_BackReference)
	{
		this.wellSample_BackReferenceList.add(wellSample_BackReference);
	}

	public Element asXMLElement(Document document)
	{
		// Creating XML block for Image
		Element Image_element = document.createElement("Image");
		if (id != null)
		{
			// Attribute property ID
			Image_element.setAttribute("ID", id.toString());
		}
		if (name != null)
		{
			// Attribute property Name
			Image_element.setAttribute("Name", name.toString());
		}
		if (acquiredDate != null)
		{
			// Element property AcquiredDate which is not complex (has no
			// sub-elements)
			Element acquiredDate_element = document.createElement("AcquiredDate");
			acquiredDate_element.setTextContent(acquiredDate);
			Image_element.appendChild(acquiredDate_element);
		}
		if (experimenter != null)
		{
			// Element property ExperimenterRef which is complex (has
			// sub-elements)
			Image_element.appendChild(experimenter.asXMLElement(document));
		}
		if (description != null)
		{
			// Element property Description which is not complex (has no
			// sub-elements)
			Element description_element = document.createElement("Description");
			description_element.setTextContent(description);
			Image_element.appendChild(description_element);
		}
		if (experiment != null)
		{
			// Element property ExperimentRef which is complex (has
			// sub-elements)
			Image_element.appendChild(experiment.asXMLElement(document));
		}
		if (group != null)
		{
			// Element property GroupRef which is complex (has
			// sub-elements)
			Image_element.appendChild(group.asXMLElement(document));
		}
		if (datasetList != null)
		{
			// Element property DatasetRef which is complex (has
			// sub-elements) and occurs more than once
			for (Dataset datasetList_value : datasetList)
			{
				Image_element.appendChild(datasetList_value.asXMLElement(document));
			}
		}
		if (instrument != null)
		{
			// Element property InstrumentRef which is complex (has
			// sub-elements)
			Image_element.appendChild(instrument.asXMLElement(document));
		}
		if (objectiveSettings != null)
		{
			// Element property ObjectiveSettings which is complex (has
			// sub-elements)
			Image_element.appendChild(objectiveSettings.asXMLElement(document));
		}
		if (imagingEnvironment != null)
		{
			// Element property ImagingEnvironment which is complex (has
			// sub-elements)
			Image_element.appendChild(imagingEnvironment.asXMLElement(document));
		}
		if (stageLabel != null)
		{
			// Element property StageLabel which is complex (has
			// sub-elements)
			Image_element.appendChild(stageLabel.asXMLElement(document));
		}
		if (pixels != null)
		{
			// Element property Pixels which is complex (has
			// sub-elements)
			Image_element.appendChild(pixels.asXMLElement(document));
		}
		if (roiList != null)
		{
			// Element property ROIRef which is complex (has
			// sub-elements) and occurs more than once
			for (ROI roiList_value : roiList)
			{
				Image_element.appendChild(roiList_value.asXMLElement(document));
			}
		}
		if (microbeamManipulationList != null)
		{
			// Element property MicrobeamManipulationRef which is complex (has
			// sub-elements) and occurs more than once
			for (MicrobeamManipulation microbeamManipulationList_value : microbeamManipulationList)
			{
				Image_element.appendChild(microbeamManipulationList_value.asXMLElement(document));
			}
		}
		if (annotationList != null)
		{
			// Element property AnnotationRef which is complex (has
			// sub-elements) and occurs more than once
			for (Annotation annotationList_value : annotationList)
			{
				Image_element.appendChild(annotationList_value.asXMLElement(document));
			}
		}
		if (wellSample_BackReferenceList != null)
		{
			// *** IGNORING *** Skipped back reference WellSample_BackReference
		}
		return Image_element;
	}

	public static Image fromXMLElement(Element element)
		throws EnumerationException
	{
		String tagName = element.getTagName();
		if (!"Image".equals(tagName))
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"Expecting node name of Image got %s",
					tagName));
		}
		Image instance = new Image();
		if (element.hasAttribute("ID"))
		{
			// Attribute property ID
			instance.setID(String.valueOf(
					element.getAttribute("ID")));
		}
		if (element.hasAttribute("Name"))
		{
			// Attribute property Name
			instance.setName(String.valueOf(
					element.getAttribute("Name")));
		}
		NodeList AcquiredDate_nodeList = element.getElementsByTagName("AcquiredDate");
		if (AcquiredDate_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"AcquiredDate node list size %d != 1",
					AcquiredDate_nodeList.getLength()));
		}
		else if (AcquiredDate_nodeList.getLength() != 0)
		{
			// Element property AcquiredDate which is not complex (has no
			// sub-elements)
			instance.setAcquiredDate(AcquiredDate_nodeList.item(0).getTextContent());
		}
		NodeList ExperimenterRef_nodeList = element.getElementsByTagName("ExperimenterRef");
		if (ExperimenterRef_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"ExperimenterRef node list size %d != 1",
					ExperimenterRef_nodeList.getLength()));
		}
		else if (ExperimenterRef_nodeList.getLength() != 0)
		{
			// Element property ExperimenterRef which is complex (has
			// sub-elements)
			instance.setExperimenter(Experimenter.fromXMLElement(
					(Element) ExperimenterRef_nodeList.item(0)));
		}
		NodeList Description_nodeList = element.getElementsByTagName("Description");
		if (Description_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"Description node list size %d != 1",
					Description_nodeList.getLength()));
		}
		else if (Description_nodeList.getLength() != 0)
		{
			// Element property Description which is not complex (has no
			// sub-elements)
			instance.setDescription(Description_nodeList.item(0).getTextContent());
		}
		NodeList ExperimentRef_nodeList = element.getElementsByTagName("ExperimentRef");
		if (ExperimentRef_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"ExperimentRef node list size %d != 1",
					ExperimentRef_nodeList.getLength()));
		}
		else if (ExperimentRef_nodeList.getLength() != 0)
		{
			// Element property ExperimentRef which is complex (has
			// sub-elements)
			instance.setExperiment(Experiment.fromXMLElement(
					(Element) ExperimentRef_nodeList.item(0)));
		}
		NodeList GroupRef_nodeList = element.getElementsByTagName("GroupRef");
		if (GroupRef_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"GroupRef node list size %d != 1",
					GroupRef_nodeList.getLength()));
		}
		else if (GroupRef_nodeList.getLength() != 0)
		{
			// Element property GroupRef which is complex (has
			// sub-elements)
			instance.setGroup(Group.fromXMLElement(
					(Element) GroupRef_nodeList.item(0)));
		}
		// Element property DatasetRef which is complex (has
		// sub-elements) and occurs more than once
		NodeList DatasetRef_nodeList = element.getElementsByTagName("DatasetRef");
		for (int i = 0; i < DatasetRef_nodeList.getLength(); i++)
		{
			instance.addDataset(Dataset.fromXMLElement(
					(Element) DatasetRef_nodeList.item(i)));
		}
		NodeList InstrumentRef_nodeList = element.getElementsByTagName("InstrumentRef");
		if (InstrumentRef_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"InstrumentRef node list size %d != 1",
					InstrumentRef_nodeList.getLength()));
		}
		else if (InstrumentRef_nodeList.getLength() != 0)
		{
			// Element property InstrumentRef which is complex (has
			// sub-elements)
			instance.setInstrument(Instrument.fromXMLElement(
					(Element) InstrumentRef_nodeList.item(0)));
		}
		NodeList ObjectiveSettings_nodeList = element.getElementsByTagName("ObjectiveSettings");
		if (ObjectiveSettings_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"ObjectiveSettings node list size %d != 1",
					ObjectiveSettings_nodeList.getLength()));
		}
		else if (ObjectiveSettings_nodeList.getLength() != 0)
		{
			// Element property ObjectiveSettings which is complex (has
			// sub-elements)
			instance.setObjectiveSettings(ObjectiveSettings.fromXMLElement(
					(Element) ObjectiveSettings_nodeList.item(0)));
		}
		NodeList ImagingEnvironment_nodeList = element.getElementsByTagName("ImagingEnvironment");
		if (ImagingEnvironment_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"ImagingEnvironment node list size %d != 1",
					ImagingEnvironment_nodeList.getLength()));
		}
		else if (ImagingEnvironment_nodeList.getLength() != 0)
		{
			// Element property ImagingEnvironment which is complex (has
			// sub-elements)
			instance.setImagingEnvironment(ImagingEnvironment.fromXMLElement(
					(Element) ImagingEnvironment_nodeList.item(0)));
		}
		NodeList StageLabel_nodeList = element.getElementsByTagName("StageLabel");
		if (StageLabel_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"StageLabel node list size %d != 1",
					StageLabel_nodeList.getLength()));
		}
		else if (StageLabel_nodeList.getLength() != 0)
		{
			// Element property StageLabel which is complex (has
			// sub-elements)
			instance.setStageLabel(StageLabel.fromXMLElement(
					(Element) StageLabel_nodeList.item(0)));
		}
		NodeList Pixels_nodeList = element.getElementsByTagName("Pixels");
		if (Pixels_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"Pixels node list size %d != 1",
					Pixels_nodeList.getLength()));
		}
		else if (Pixels_nodeList.getLength() != 0)
		{
			// Element property Pixels which is complex (has
			// sub-elements)
			instance.setPixels(Pixels.fromXMLElement(
					(Element) Pixels_nodeList.item(0)));
		}
		// Element property ROIRef which is complex (has
		// sub-elements) and occurs more than once
		NodeList ROIRef_nodeList = element.getElementsByTagName("ROIRef");
		for (int i = 0; i < ROIRef_nodeList.getLength(); i++)
		{
			instance.addROI(ROI.fromXMLElement(
					(Element) ROIRef_nodeList.item(i)));
		}
		// Element property MicrobeamManipulationRef which is complex (has
		// sub-elements) and occurs more than once
		NodeList MicrobeamManipulationRef_nodeList = element.getElementsByTagName("MicrobeamManipulationRef");
		for (int i = 0; i < MicrobeamManipulationRef_nodeList.getLength(); i++)
		{
			instance.addMicrobeamManipulation(MicrobeamManipulation.fromXMLElement(
					(Element) MicrobeamManipulationRef_nodeList.item(i)));
		}
		// Element property AnnotationRef which is complex (has
		// sub-elements) and occurs more than once
		NodeList AnnotationRef_nodeList = element.getElementsByTagName("AnnotationRef");
		for (int i = 0; i < AnnotationRef_nodeList.getLength(); i++)
		{
			instance.addAnnotation(Annotation.fromXMLElement(
					(Element) AnnotationRef_nodeList.item(i)));
		}
		// *** IGNORING *** Skipped back reference WellSample_BackReference
		return instance;
	}
}