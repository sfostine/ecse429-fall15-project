/**
 */
package ca.mcgill.sel.ram.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.mcgill.sel.core.CorePackage;
import ca.mcgill.sel.ram.AbstractMessageView;
import ca.mcgill.sel.ram.Aspect;
import ca.mcgill.sel.ram.AspectMessageView;
import ca.mcgill.sel.ram.AssignmentStatement;
import ca.mcgill.sel.ram.Association;
import ca.mcgill.sel.ram.AssociationEnd;
import ca.mcgill.sel.ram.Attribute;
import ca.mcgill.sel.ram.AttributeMapping;
import ca.mcgill.sel.ram.Classifier;
import ca.mcgill.sel.ram.ClassifierMapping;
import ca.mcgill.sel.ram.CombinedFragment;
import ca.mcgill.sel.ram.Constraint;
import ca.mcgill.sel.ram.DestructionOccurrenceSpecification;
import ca.mcgill.sel.ram.EnumLiteralValue;
import ca.mcgill.sel.ram.ExecutionStatement;
import ca.mcgill.sel.ram.FragmentContainer;
import ca.mcgill.sel.ram.Gate;
import ca.mcgill.sel.ram.ImplementationClass;
import ca.mcgill.sel.ram.Instantiation;
import ca.mcgill.sel.ram.InstantiationType;
import ca.mcgill.sel.ram.Interaction;
import ca.mcgill.sel.ram.InteractionFragment;
import ca.mcgill.sel.ram.InteractionOperand;
import ca.mcgill.sel.ram.InteractionOperatorKind;
import ca.mcgill.sel.ram.Layout;
import ca.mcgill.sel.ram.LayoutElement;
import ca.mcgill.sel.ram.Lifeline;
import ca.mcgill.sel.ram.LiteralBoolean;
import ca.mcgill.sel.ram.LiteralInteger;
import ca.mcgill.sel.ram.LiteralNull;
import ca.mcgill.sel.ram.LiteralSpecification;
import ca.mcgill.sel.ram.LiteralString;
import ca.mcgill.sel.ram.MappableElement;
import ca.mcgill.sel.ram.Message;
import ca.mcgill.sel.ram.MessageEnd;
import ca.mcgill.sel.ram.MessageOccurrenceSpecification;
import ca.mcgill.sel.ram.MessageSort;
import ca.mcgill.sel.ram.MessageView;
import ca.mcgill.sel.ram.MessageViewReference;
import ca.mcgill.sel.ram.NamedElement;
import ca.mcgill.sel.ram.ObjectType;
import ca.mcgill.sel.ram.OccurrenceSpecification;
import ca.mcgill.sel.ram.OpaqueExpression;
import ca.mcgill.sel.ram.Operation;
import ca.mcgill.sel.ram.OperationMapping;
import ca.mcgill.sel.ram.OperationType;
import ca.mcgill.sel.ram.OriginalBehaviorExecution;
import ca.mcgill.sel.ram.Parameter;
import ca.mcgill.sel.ram.ParameterMapping;
import ca.mcgill.sel.ram.ParameterValue;
import ca.mcgill.sel.ram.ParameterValueMapping;
import ca.mcgill.sel.ram.PrimitiveType;
import ca.mcgill.sel.ram.Property;
import ca.mcgill.sel.ram.RAMVisibilityType;
import ca.mcgill.sel.ram.RAny;
import ca.mcgill.sel.ram.RArray;
import ca.mcgill.sel.ram.RBoolean;
import ca.mcgill.sel.ram.RChar;
import ca.mcgill.sel.ram.RCollection;
import ca.mcgill.sel.ram.RDouble;
import ca.mcgill.sel.ram.REnum;
import ca.mcgill.sel.ram.REnumLiteral;
import ca.mcgill.sel.ram.RFloat;
import ca.mcgill.sel.ram.RInt;
import ca.mcgill.sel.ram.RLong;
import ca.mcgill.sel.ram.RSequence;
import ca.mcgill.sel.ram.RSet;
import ca.mcgill.sel.ram.RString;
import ca.mcgill.sel.ram.RVoid;
import ca.mcgill.sel.ram.RamFactory;
import ca.mcgill.sel.ram.RamPackage;
import ca.mcgill.sel.ram.Reference;
import ca.mcgill.sel.ram.ReferenceType;
import ca.mcgill.sel.ram.State;
import ca.mcgill.sel.ram.StateMachine;
import ca.mcgill.sel.ram.StateView;
import ca.mcgill.sel.ram.StructuralFeature;
import ca.mcgill.sel.ram.StructuralFeatureValue;
import ca.mcgill.sel.ram.StructuralView;
import ca.mcgill.sel.ram.Substitution;
import ca.mcgill.sel.ram.TemporaryProperty;
import ca.mcgill.sel.ram.Traceable;
import ca.mcgill.sel.ram.Transition;
import ca.mcgill.sel.ram.TransitionSubstitution;
import ca.mcgill.sel.ram.Type;
import ca.mcgill.sel.ram.TypeParameter;
import ca.mcgill.sel.ram.TypedElement;
import ca.mcgill.sel.ram.ValueSpecification;
import ca.mcgill.sel.ram.WovenAspect;
import ca.mcgill.sel.ram.util.RamValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RamPackageImpl extends EPackageImpl implements RamPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass aspectEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mappableElementEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass structuralViewEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associationEndEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associationEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedElementEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass instantiationEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass primitiveTypeEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass objectTypeEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rVoidEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rBooleanEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rIntEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rCharEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rStringEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rAnyEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rEnumEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rEnumLiteralEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractMessageViewEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messageViewEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messageViewReferenceEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass aspectMessageViewEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lifelineEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messageEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messageEndEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messageOccurrenceSpecificationEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass occurrenceSpecificationEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass destructionOccurrenceSpecificationEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionFragmentEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass combinedFragmentEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass originalBehaviorExecutionEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass executionStatementEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionOperandEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valueSpecificationEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass structuralFeatureValueEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterValueMappingEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterValueEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass opaqueExpressionEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalSpecificationEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalStringEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalIntegerEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fragmentContainerEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rCollectionEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rSetEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rSequenceEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass layoutEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass containerMapEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elementMapEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass layoutElementEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classifierEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass implementationClassEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass temporaryPropertyEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass structuralFeatureEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typedElementEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gateEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalBooleanEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classifierMappingEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeMappingEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationMappingEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterMappingEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stateViewEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stateMachineEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transitionEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stateEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rDoubleEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rFloatEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass constraintEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass substitutionEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transitionSubstitutionEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeParameterEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rLongEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rArrayEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass traceableEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass wovenAspectEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalNullEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumLiteralValueEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentStatementEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum ramVisibilityTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum referenceTypeEEnum = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum messageSortEEnum = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum interactionOperatorKindEEnum = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum instantiationTypeEEnum = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum operationTypeEEnum = null;
    
    /**
     * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
     * EPackage.Registry} by the package
     * package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see ca.mcgill.sel.ram.RamPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RamPackageImpl() {
        super(eNS_URI, RamFactory.eINSTANCE);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;
    
    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link RamPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RamPackage init() {
        if (isInited) return (RamPackage)EPackage.Registry.INSTANCE.getEPackage(RamPackage.eNS_URI);

        // Obtain or create and register package
        RamPackageImpl theRamPackage = (RamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RamPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        CorePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theRamPackage.createPackageContents();

        // Initialize created meta-data
        theRamPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theRamPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return RamValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theRamPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RamPackage.eNS_URI, theRamPackage);
        return theRamPackage;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAspect() {
        return aspectEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAspect_StructuralView() {
        return (EReference)aspectEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAspect_MessageViews() {
        return (EReference)aspectEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAspect_Instantiations() {
        return (EReference)aspectEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAspect_Layout() {
        return (EReference)aspectEClass.getEStructuralFeatures().get(3);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAspect_StateViews() {
        return (EReference)aspectEClass.getEStructuralFeatures().get(4);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAspect_WovenAspects() {
        return (EReference)aspectEClass.getEStructuralFeatures().get(5);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMappableElement() {
        return mappableElementEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStructuralView() {
        return structuralViewEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructuralView_Classes() {
        return (EReference)structuralViewEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructuralView_Associations() {
        return (EReference)structuralViewEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructuralView_Types() {
        return (EReference)structuralViewEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClass_() {
        return classEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClass_Attributes() {
        return (EReference)classEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClass_Abstract() {
        return (EAttribute)classEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssociationEnd() {
        return associationEndEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssociationEnd_Navigable() {
        return (EAttribute)associationEndEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociationEnd_Assoc() {
        return (EReference)associationEndEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociationEnd_Classifier() {
        return (EReference)associationEndEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociationEnd_FeatureSelection() {
        return (EReference)associationEndEClass.getEStructuralFeatures().get(3);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssociation() {
        return associationEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociation_Ends() {
        return (EReference)associationEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNamedElement() {
        return namedElementEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInstantiation() {
        return instantiationEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstantiation_Type() {
        return (EAttribute)instantiationEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperation() {
        return operationEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Abstract() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_ExtendedVisibility() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperation_ReturnType() {
        return (EReference)operationEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperation_Parameters() {
        return (EReference)operationEClass.getEStructuralFeatures().get(3);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Static() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_OperationType() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(5);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttribute() {
        return attributeEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttribute_Type() {
        return (EReference)attributeEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getType() {
        return typeEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameter() {
        return parameterEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameter_Type() {
        return (EReference)parameterEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrimitiveType() {
        return primitiveTypeEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getObjectType() {
        return objectTypeEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRVoid() {
        return rVoidEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRBoolean() {
        return rBooleanEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRInt() {
        return rIntEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRChar() {
        return rCharEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRString() {
        return rStringEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRAny() {
        return rAnyEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getREnum() {
        return rEnumEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getREnum_Literals() {
        return (EReference)rEnumEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getREnumLiteral() {
        return rEnumLiteralEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getREnumLiteral_Enum() {
        return (EReference)rEnumLiteralEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractMessageView() {
        return abstractMessageViewEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractMessageView_AffectedBy() {
        return (EReference)abstractMessageViewEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMessageView() {
        return messageViewEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessageView_Specifies() {
        return (EReference)messageViewEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessageView_Specification() {
        return (EReference)messageViewEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMessageViewReference() {
        return messageViewReferenceEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessageViewReference_References() {
        return (EReference)messageViewReferenceEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteraction() {
        return interactionEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteraction_Lifelines() {
        return (EReference)interactionEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteraction_Messages() {
        return (EReference)interactionEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteraction_Properties() {
        return (EReference)interactionEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteraction_FormalGates() {
        return (EReference)interactionEClass.getEStructuralFeatures().get(3);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAspectMessageView() {
        return aspectMessageViewEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAspectMessageView_Pointcut() {
        return (EReference)aspectMessageViewEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAspectMessageView_Advice() {
        return (EReference)aspectMessageViewEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLifeline() {
        return lifelineEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLifeline_Represents() {
        return (EReference)lifelineEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLifeline_CoveredBy() {
        return (EReference)lifelineEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMessage() {
        return messageEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessage_SendEvent() {
        return (EReference)messageEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessage_ReceiveEvent() {
        return (EReference)messageEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessage_Signature() {
        return (EReference)messageEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessage_AssignTo() {
        return (EReference)messageEClass.getEStructuralFeatures().get(3);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessage_MessageSort() {
        return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessage_Arguments() {
        return (EReference)messageEClass.getEStructuralFeatures().get(5);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessage_Interaction() {
        return (EReference)messageEClass.getEStructuralFeatures().get(6);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessage_Returns() {
        return (EReference)messageEClass.getEStructuralFeatures().get(7);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessage_SelfMessage() {
        return (EAttribute)messageEClass.getEStructuralFeatures().get(8);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessage_LocalProperties() {
        return (EReference)messageEClass.getEStructuralFeatures().get(9);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMessageEnd() {
        return messageEndEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMessageEnd_Message() {
        return (EReference)messageEndEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMessageOccurrenceSpecification() {
        return messageOccurrenceSpecificationEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOccurrenceSpecification() {
        return occurrenceSpecificationEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDestructionOccurrenceSpecification() {
        return destructionOccurrenceSpecificationEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionFragment() {
        return interactionFragmentEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionFragment_Covered() {
        return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionFragment_Container() {
        return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCombinedFragment() {
        return combinedFragmentEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCombinedFragment_InteractionOperator() {
        return (EAttribute)combinedFragmentEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCombinedFragment_Operands() {
        return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOriginalBehaviorExecution() {
        return originalBehaviorExecutionEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExecutionStatement() {
        return executionStatementEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecutionStatement_Specification() {
        return (EReference)executionStatementEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionOperand() {
        return interactionOperandEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionOperand_InteractionConstraint() {
        return (EReference)interactionOperandEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getValueSpecification() {
        return valueSpecificationEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStructuralFeatureValue() {
        return structuralFeatureValueEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructuralFeatureValue_Value() {
        return (EReference)structuralFeatureValueEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameterValueMapping() {
        return parameterValueMappingEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterValueMapping_Parameter() {
        return (EReference)parameterValueMappingEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterValueMapping_Value() {
        return (EReference)parameterValueMappingEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameterValue() {
        return parameterValueEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterValue_Parameter() {
        return (EReference)parameterValueEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpaqueExpression() {
        return opaqueExpressionEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpaqueExpression_Body() {
        return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpaqueExpression_Language() {
        return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLiteralSpecification() {
        return literalSpecificationEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLiteralString() {
        return literalStringEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLiteralString_Value() {
        return (EAttribute)literalStringEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLiteralInteger() {
        return literalIntegerEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLiteralInteger_Value() {
        return (EAttribute)literalIntegerEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFragmentContainer() {
        return fragmentContainerEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFragmentContainer_Fragments() {
        return (EReference)fragmentContainerEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRCollection() {
        return rCollectionEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRCollection_Type() {
        return (EReference)rCollectionEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRSet() {
        return rSetEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRSequence() {
        return rSequenceEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLayout() {
        return layoutEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLayout_Containers() {
        return (EReference)layoutEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContainerMap() {
        return containerMapEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainerMap_Key() {
        return (EReference)containerMapEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainerMap_Value() {
        return (EReference)containerMapEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElementMap() {
        return elementMapEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElementMap_Key() {
        return (EReference)elementMapEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElementMap_Value() {
        return (EReference)elementMapEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLayoutElement() {
        return layoutElementEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLayoutElement_X() {
        return (EAttribute)layoutElementEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLayoutElement_Y() {
        return (EAttribute)layoutElementEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClassifier() {
        return classifierEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifier_Operations() {
        return (EReference)classifierEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifier_AssociationEnds() {
        return (EReference)classifierEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifier_TypeParameters() {
        return (EReference)classifierEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifier_SuperTypes() {
        return (EReference)classifierEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImplementationClass() {
        return implementationClassEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImplementationClass_InstanceClassName() {
        return (EAttribute)implementationClassEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImplementationClass_Interface() {
        return (EAttribute)implementationClassEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTemporaryProperty() {
        return temporaryPropertyEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStructuralFeature() {
        return structuralFeatureEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStructuralFeature_Static() {
        return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReference() {
        return referenceEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReference_Type() {
        return (EReference)referenceEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_LowerBound() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_UpperBound() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_ReferenceType() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypedElement() {
        return typedElementEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGate() {
        return gateEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLiteralBoolean() {
        return literalBooleanEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLiteralBoolean_Value() {
        return (EAttribute)literalBooleanEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClassifierMapping() {
        return classifierMappingEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifierMapping_OperationMappings() {
        return (EReference)classifierMappingEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifierMapping_AttributeMappings() {
        return (EReference)classifierMappingEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeMapping() {
        return attributeMappingEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperationMapping() {
        return operationMappingEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationMapping_ParameterMappings() {
        return (EReference)operationMappingEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameterMapping() {
        return parameterMappingEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStateView() {
        return stateViewEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStateView_StateMachines() {
        return (EReference)stateViewEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStateView_Specifies() {
        return (EReference)stateViewEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStateMachine() {
        return stateMachineEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStateMachine_Start() {
        return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStateMachine_States() {
        return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStateMachine_Transitions() {
        return (EReference)stateMachineEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStateMachine_Substitutions() {
        return (EReference)stateMachineEClass.getEStructuralFeatures().get(3);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTransition() {
        return transitionEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransition_EndState() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransition_StartState() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransition_Signature() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransition_Guard() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(3);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getState() {
        return stateEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_Incomings() {
        return (EReference)stateEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_Outgoings() {
        return (EReference)stateEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRDouble() {
        return rDoubleEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRFloat() {
        return rFloatEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConstraint() {
        return constraintEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConstraint_Specification() {
        return (EReference)constraintEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubstitution() {
        return substitutionEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTransitionSubstitution() {
        return transitionSubstitutionEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransitionSubstitution_From() {
        return (EReference)transitionSubstitutionEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransitionSubstitution_To() {
        return (EReference)transitionSubstitutionEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypeParameter() {
        return typeParameterEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTypeParameter_GenericType() {
        return (EReference)typeParameterEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRLong() {
        return rLongEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRArray() {
        return rArrayEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRArray_Size() {
        return (EAttribute)rArrayEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRArray_Type() {
        return (EReference)rArrayEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTraceable() {
        return traceableEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWovenAspect() {
        return wovenAspectEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWovenAspect_ComesFrom() {
        return (EReference)wovenAspectEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWovenAspect_WovenElements() {
        return (EReference)wovenAspectEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWovenAspect_Children() {
        return (EReference)wovenAspectEClass.getEStructuralFeatures().get(2);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLiteralNull() {
        return literalNullEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnumLiteralValue() {
        return enumLiteralValueEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumLiteralValue_Value() {
        return (EReference)enumLiteralValueEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssignmentStatement() {
        return assignmentStatementEClass;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignmentStatement_AssignTo() {
        return (EReference)assignmentStatementEClass.getEStructuralFeatures().get(0);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignmentStatement_Value() {
        return (EReference)assignmentStatementEClass.getEStructuralFeatures().get(1);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRAMVisibilityType() {
        return ramVisibilityTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getReferenceType() {
        return referenceTypeEEnum;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMessageSort() {
        return messageSortEEnum;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getInteractionOperatorKind() {
        return interactionOperatorKindEEnum;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getInstantiationType() {
        return instantiationTypeEEnum;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOperationType() {
        return operationTypeEEnum;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RamFactory getRamFactory() {
        return (RamFactory)getEFactoryInstance();
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;
    
    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        aspectEClass = createEClass(ASPECT);
        createEReference(aspectEClass, ASPECT__STRUCTURAL_VIEW);
        createEReference(aspectEClass, ASPECT__MESSAGE_VIEWS);
        createEReference(aspectEClass, ASPECT__INSTANTIATIONS);
        createEReference(aspectEClass, ASPECT__LAYOUT);
        createEReference(aspectEClass, ASPECT__STATE_VIEWS);
        createEReference(aspectEClass, ASPECT__WOVEN_ASPECTS);

        mappableElementEClass = createEClass(MAPPABLE_ELEMENT);

        structuralViewEClass = createEClass(STRUCTURAL_VIEW);
        createEReference(structuralViewEClass, STRUCTURAL_VIEW__CLASSES);
        createEReference(structuralViewEClass, STRUCTURAL_VIEW__ASSOCIATIONS);
        createEReference(structuralViewEClass, STRUCTURAL_VIEW__TYPES);

        classEClass = createEClass(CLASS);
        createEReference(classEClass, CLASS__ATTRIBUTES);
        createEAttribute(classEClass, CLASS__ABSTRACT);

        associationEndEClass = createEClass(ASSOCIATION_END);
        createEAttribute(associationEndEClass, ASSOCIATION_END__NAVIGABLE);
        createEReference(associationEndEClass, ASSOCIATION_END__ASSOC);
        createEReference(associationEndEClass, ASSOCIATION_END__CLASSIFIER);
        createEReference(associationEndEClass, ASSOCIATION_END__FEATURE_SELECTION);

        associationEClass = createEClass(ASSOCIATION);
        createEReference(associationEClass, ASSOCIATION__ENDS);

        namedElementEClass = createEClass(NAMED_ELEMENT);

        instantiationEClass = createEClass(INSTANTIATION);
        createEAttribute(instantiationEClass, INSTANTIATION__TYPE);

        operationEClass = createEClass(OPERATION);
        createEAttribute(operationEClass, OPERATION__ABSTRACT);
        createEAttribute(operationEClass, OPERATION__EXTENDED_VISIBILITY);
        createEReference(operationEClass, OPERATION__RETURN_TYPE);
        createEReference(operationEClass, OPERATION__PARAMETERS);
        createEAttribute(operationEClass, OPERATION__STATIC);
        createEAttribute(operationEClass, OPERATION__OPERATION_TYPE);

        attributeEClass = createEClass(ATTRIBUTE);
        createEReference(attributeEClass, ATTRIBUTE__TYPE);

        typeEClass = createEClass(TYPE);

        parameterEClass = createEClass(PARAMETER);
        createEReference(parameterEClass, PARAMETER__TYPE);

        primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

        objectTypeEClass = createEClass(OBJECT_TYPE);

        rVoidEClass = createEClass(RVOID);

        rBooleanEClass = createEClass(RBOOLEAN);

        rIntEClass = createEClass(RINT);

        rCharEClass = createEClass(RCHAR);

        rStringEClass = createEClass(RSTRING);

        rAnyEClass = createEClass(RANY);

        rEnumEClass = createEClass(RENUM);
        createEReference(rEnumEClass, RENUM__LITERALS);

        rEnumLiteralEClass = createEClass(RENUM_LITERAL);
        createEReference(rEnumLiteralEClass, RENUM_LITERAL__ENUM);

        abstractMessageViewEClass = createEClass(ABSTRACT_MESSAGE_VIEW);
        createEReference(abstractMessageViewEClass, ABSTRACT_MESSAGE_VIEW__AFFECTED_BY);

        messageViewEClass = createEClass(MESSAGE_VIEW);
        createEReference(messageViewEClass, MESSAGE_VIEW__SPECIFIES);
        createEReference(messageViewEClass, MESSAGE_VIEW__SPECIFICATION);

        messageViewReferenceEClass = createEClass(MESSAGE_VIEW_REFERENCE);
        createEReference(messageViewReferenceEClass, MESSAGE_VIEW_REFERENCE__REFERENCES);

        interactionEClass = createEClass(INTERACTION);
        createEReference(interactionEClass, INTERACTION__LIFELINES);
        createEReference(interactionEClass, INTERACTION__MESSAGES);
        createEReference(interactionEClass, INTERACTION__PROPERTIES);
        createEReference(interactionEClass, INTERACTION__FORMAL_GATES);

        aspectMessageViewEClass = createEClass(ASPECT_MESSAGE_VIEW);
        createEReference(aspectMessageViewEClass, ASPECT_MESSAGE_VIEW__POINTCUT);
        createEReference(aspectMessageViewEClass, ASPECT_MESSAGE_VIEW__ADVICE);

        lifelineEClass = createEClass(LIFELINE);
        createEReference(lifelineEClass, LIFELINE__REPRESENTS);
        createEReference(lifelineEClass, LIFELINE__COVERED_BY);

        messageEClass = createEClass(MESSAGE);
        createEReference(messageEClass, MESSAGE__SEND_EVENT);
        createEReference(messageEClass, MESSAGE__RECEIVE_EVENT);
        createEReference(messageEClass, MESSAGE__SIGNATURE);
        createEReference(messageEClass, MESSAGE__ASSIGN_TO);
        createEAttribute(messageEClass, MESSAGE__MESSAGE_SORT);
        createEReference(messageEClass, MESSAGE__ARGUMENTS);
        createEReference(messageEClass, MESSAGE__INTERACTION);
        createEReference(messageEClass, MESSAGE__RETURNS);
        createEAttribute(messageEClass, MESSAGE__SELF_MESSAGE);
        createEReference(messageEClass, MESSAGE__LOCAL_PROPERTIES);

        messageEndEClass = createEClass(MESSAGE_END);
        createEReference(messageEndEClass, MESSAGE_END__MESSAGE);

        messageOccurrenceSpecificationEClass = createEClass(MESSAGE_OCCURRENCE_SPECIFICATION);

        occurrenceSpecificationEClass = createEClass(OCCURRENCE_SPECIFICATION);

        destructionOccurrenceSpecificationEClass = createEClass(DESTRUCTION_OCCURRENCE_SPECIFICATION);

        interactionFragmentEClass = createEClass(INTERACTION_FRAGMENT);
        createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__COVERED);
        createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__CONTAINER);

        combinedFragmentEClass = createEClass(COMBINED_FRAGMENT);
        createEAttribute(combinedFragmentEClass, COMBINED_FRAGMENT__INTERACTION_OPERATOR);
        createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__OPERANDS);

        originalBehaviorExecutionEClass = createEClass(ORIGINAL_BEHAVIOR_EXECUTION);

        executionStatementEClass = createEClass(EXECUTION_STATEMENT);
        createEReference(executionStatementEClass, EXECUTION_STATEMENT__SPECIFICATION);

        interactionOperandEClass = createEClass(INTERACTION_OPERAND);
        createEReference(interactionOperandEClass, INTERACTION_OPERAND__INTERACTION_CONSTRAINT);

        valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

        structuralFeatureValueEClass = createEClass(STRUCTURAL_FEATURE_VALUE);
        createEReference(structuralFeatureValueEClass, STRUCTURAL_FEATURE_VALUE__VALUE);

        parameterValueMappingEClass = createEClass(PARAMETER_VALUE_MAPPING);
        createEReference(parameterValueMappingEClass, PARAMETER_VALUE_MAPPING__PARAMETER);
        createEReference(parameterValueMappingEClass, PARAMETER_VALUE_MAPPING__VALUE);

        parameterValueEClass = createEClass(PARAMETER_VALUE);
        createEReference(parameterValueEClass, PARAMETER_VALUE__PARAMETER);

        opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
        createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__BODY);
        createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__LANGUAGE);

        literalSpecificationEClass = createEClass(LITERAL_SPECIFICATION);

        literalStringEClass = createEClass(LITERAL_STRING);
        createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

        literalIntegerEClass = createEClass(LITERAL_INTEGER);
        createEAttribute(literalIntegerEClass, LITERAL_INTEGER__VALUE);

        fragmentContainerEClass = createEClass(FRAGMENT_CONTAINER);
        createEReference(fragmentContainerEClass, FRAGMENT_CONTAINER__FRAGMENTS);

        rCollectionEClass = createEClass(RCOLLECTION);
        createEReference(rCollectionEClass, RCOLLECTION__TYPE);

        rSetEClass = createEClass(RSET);

        rSequenceEClass = createEClass(RSEQUENCE);

        layoutEClass = createEClass(LAYOUT);
        createEReference(layoutEClass, LAYOUT__CONTAINERS);

        containerMapEClass = createEClass(CONTAINER_MAP);
        createEReference(containerMapEClass, CONTAINER_MAP__KEY);
        createEReference(containerMapEClass, CONTAINER_MAP__VALUE);

        elementMapEClass = createEClass(ELEMENT_MAP);
        createEReference(elementMapEClass, ELEMENT_MAP__KEY);
        createEReference(elementMapEClass, ELEMENT_MAP__VALUE);

        layoutElementEClass = createEClass(LAYOUT_ELEMENT);
        createEAttribute(layoutElementEClass, LAYOUT_ELEMENT__X);
        createEAttribute(layoutElementEClass, LAYOUT_ELEMENT__Y);

        classifierEClass = createEClass(CLASSIFIER);
        createEReference(classifierEClass, CLASSIFIER__OPERATIONS);
        createEReference(classifierEClass, CLASSIFIER__ASSOCIATION_ENDS);
        createEReference(classifierEClass, CLASSIFIER__TYPE_PARAMETERS);
        createEReference(classifierEClass, CLASSIFIER__SUPER_TYPES);

        implementationClassEClass = createEClass(IMPLEMENTATION_CLASS);
        createEAttribute(implementationClassEClass, IMPLEMENTATION_CLASS__INSTANCE_CLASS_NAME);
        createEAttribute(implementationClassEClass, IMPLEMENTATION_CLASS__INTERFACE);

        temporaryPropertyEClass = createEClass(TEMPORARY_PROPERTY);

        structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);
        createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__STATIC);

        referenceEClass = createEClass(REFERENCE);
        createEReference(referenceEClass, REFERENCE__TYPE);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__LOWER_BOUND);
        createEAttribute(propertyEClass, PROPERTY__UPPER_BOUND);
        createEAttribute(propertyEClass, PROPERTY__REFERENCE_TYPE);

        typedElementEClass = createEClass(TYPED_ELEMENT);

        gateEClass = createEClass(GATE);

        literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
        createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

        classifierMappingEClass = createEClass(CLASSIFIER_MAPPING);
        createEReference(classifierMappingEClass, CLASSIFIER_MAPPING__OPERATION_MAPPINGS);
        createEReference(classifierMappingEClass, CLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS);

        attributeMappingEClass = createEClass(ATTRIBUTE_MAPPING);

        operationMappingEClass = createEClass(OPERATION_MAPPING);
        createEReference(operationMappingEClass, OPERATION_MAPPING__PARAMETER_MAPPINGS);

        parameterMappingEClass = createEClass(PARAMETER_MAPPING);

        stateViewEClass = createEClass(STATE_VIEW);
        createEReference(stateViewEClass, STATE_VIEW__STATE_MACHINES);
        createEReference(stateViewEClass, STATE_VIEW__SPECIFIES);

        stateMachineEClass = createEClass(STATE_MACHINE);
        createEReference(stateMachineEClass, STATE_MACHINE__START);
        createEReference(stateMachineEClass, STATE_MACHINE__STATES);
        createEReference(stateMachineEClass, STATE_MACHINE__TRANSITIONS);
        createEReference(stateMachineEClass, STATE_MACHINE__SUBSTITUTIONS);

        transitionEClass = createEClass(TRANSITION);
        createEReference(transitionEClass, TRANSITION__END_STATE);
        createEReference(transitionEClass, TRANSITION__START_STATE);
        createEReference(transitionEClass, TRANSITION__SIGNATURE);
        createEReference(transitionEClass, TRANSITION__GUARD);

        stateEClass = createEClass(STATE);
        createEReference(stateEClass, STATE__INCOMINGS);
        createEReference(stateEClass, STATE__OUTGOINGS);

        rDoubleEClass = createEClass(RDOUBLE);

        rFloatEClass = createEClass(RFLOAT);

        constraintEClass = createEClass(CONSTRAINT);
        createEReference(constraintEClass, CONSTRAINT__SPECIFICATION);

        substitutionEClass = createEClass(SUBSTITUTION);

        transitionSubstitutionEClass = createEClass(TRANSITION_SUBSTITUTION);
        createEReference(transitionSubstitutionEClass, TRANSITION_SUBSTITUTION__FROM);
        createEReference(transitionSubstitutionEClass, TRANSITION_SUBSTITUTION__TO);

        typeParameterEClass = createEClass(TYPE_PARAMETER);
        createEReference(typeParameterEClass, TYPE_PARAMETER__GENERIC_TYPE);

        rLongEClass = createEClass(RLONG);

        rArrayEClass = createEClass(RARRAY);
        createEAttribute(rArrayEClass, RARRAY__SIZE);
        createEReference(rArrayEClass, RARRAY__TYPE);

        traceableEClass = createEClass(TRACEABLE);

        wovenAspectEClass = createEClass(WOVEN_ASPECT);
        createEReference(wovenAspectEClass, WOVEN_ASPECT__COMES_FROM);
        createEReference(wovenAspectEClass, WOVEN_ASPECT__WOVEN_ELEMENTS);
        createEReference(wovenAspectEClass, WOVEN_ASPECT__CHILDREN);

        literalNullEClass = createEClass(LITERAL_NULL);

        enumLiteralValueEClass = createEClass(ENUM_LITERAL_VALUE);
        createEReference(enumLiteralValueEClass, ENUM_LITERAL_VALUE__VALUE);

        assignmentStatementEClass = createEClass(ASSIGNMENT_STATEMENT);
        createEReference(assignmentStatementEClass, ASSIGNMENT_STATEMENT__ASSIGN_TO);
        createEReference(assignmentStatementEClass, ASSIGNMENT_STATEMENT__VALUE);

        // Create enums
        ramVisibilityTypeEEnum = createEEnum(RAM_VISIBILITY_TYPE);
        referenceTypeEEnum = createEEnum(REFERENCE_TYPE);
        messageSortEEnum = createEEnum(MESSAGE_SORT);
        interactionOperatorKindEEnum = createEEnum(INTERACTION_OPERATOR_KIND);
        instantiationTypeEEnum = createEEnum(INSTANTIATION_TYPE);
        operationTypeEEnum = createEEnum(OPERATION_TYPE);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;
    
    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        aspectEClass.getESuperTypes().add(this.getNamedElement());
        aspectEClass.getESuperTypes().add(theCorePackage.getCOREModel());
        mappableElementEClass.getESuperTypes().add(this.getNamedElement());
        mappableElementEClass.getESuperTypes().add(theCorePackage.getCOREModelElement());
        classEClass.getESuperTypes().add(this.getClassifier());
        associationEndEClass.getESuperTypes().add(this.getProperty());
        associationEClass.getESuperTypes().add(this.getNamedElement());
        namedElementEClass.getESuperTypes().add(theCorePackage.getCORENamedElement());
        EGenericType g1 = createEGenericType(theCorePackage.getCOREBinding());
        EGenericType g2 = createEGenericType(this.getAspect());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(this.getClassifierMapping());
        g1.getETypeArguments().add(g2);
        instantiationEClass.getEGenericSuperTypes().add(g1);
        operationEClass.getESuperTypes().add(this.getNamedElement());
        operationEClass.getESuperTypes().add(this.getMappableElement());
        operationEClass.getESuperTypes().add(this.getTraceable());
        attributeEClass.getESuperTypes().add(this.getStructuralFeature());
        attributeEClass.getESuperTypes().add(this.getTemporaryProperty());
        attributeEClass.getESuperTypes().add(this.getMappableElement());
        attributeEClass.getESuperTypes().add(this.getTraceable());
        typeEClass.getESuperTypes().add(this.getNamedElement());
        parameterEClass.getESuperTypes().add(this.getTypedElement());
        parameterEClass.getESuperTypes().add(this.getMappableElement());
        primitiveTypeEClass.getESuperTypes().add(this.getObjectType());
        primitiveTypeEClass.getESuperTypes().add(this.getImplementationClass());
        objectTypeEClass.getESuperTypes().add(this.getType());
        objectTypeEClass.getESuperTypes().add(this.getMappableElement());
        rVoidEClass.getESuperTypes().add(this.getType());
        rBooleanEClass.getESuperTypes().add(this.getPrimitiveType());
        rIntEClass.getESuperTypes().add(this.getPrimitiveType());
        rCharEClass.getESuperTypes().add(this.getPrimitiveType());
        rStringEClass.getESuperTypes().add(this.getPrimitiveType());
        rAnyEClass.getESuperTypes().add(this.getType());
        rEnumEClass.getESuperTypes().add(this.getPrimitiveType());
        rEnumLiteralEClass.getESuperTypes().add(this.getNamedElement());
        messageViewEClass.getESuperTypes().add(this.getAbstractMessageView());
        messageViewReferenceEClass.getESuperTypes().add(this.getAbstractMessageView());
        interactionEClass.getESuperTypes().add(this.getFragmentContainer());
        aspectMessageViewEClass.getESuperTypes().add(this.getAbstractMessageView());
        aspectMessageViewEClass.getESuperTypes().add(this.getNamedElement());
        messageOccurrenceSpecificationEClass.getESuperTypes().add(this.getOccurrenceSpecification());
        messageOccurrenceSpecificationEClass.getESuperTypes().add(this.getMessageEnd());
        occurrenceSpecificationEClass.getESuperTypes().add(this.getInteractionFragment());
        destructionOccurrenceSpecificationEClass.getESuperTypes().add(this.getMessageOccurrenceSpecification());
        combinedFragmentEClass.getESuperTypes().add(this.getInteractionFragment());
        originalBehaviorExecutionEClass.getESuperTypes().add(this.getInteractionFragment());
        executionStatementEClass.getESuperTypes().add(this.getInteractionFragment());
        interactionOperandEClass.getESuperTypes().add(this.getFragmentContainer());
        structuralFeatureValueEClass.getESuperTypes().add(this.getValueSpecification());
        parameterValueEClass.getESuperTypes().add(this.getValueSpecification());
        opaqueExpressionEClass.getESuperTypes().add(this.getValueSpecification());
        literalSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
        literalStringEClass.getESuperTypes().add(this.getLiteralSpecification());
        literalIntegerEClass.getESuperTypes().add(this.getLiteralSpecification());
        rCollectionEClass.getESuperTypes().add(this.getType());
        rCollectionEClass.getESuperTypes().add(this.getImplementationClass());
        rSetEClass.getESuperTypes().add(this.getRCollection());
        rSequenceEClass.getESuperTypes().add(this.getRCollection());
        classifierEClass.getESuperTypes().add(this.getObjectType());
        classifierEClass.getESuperTypes().add(this.getTraceable());
        implementationClassEClass.getESuperTypes().add(this.getClassifier());
        structuralFeatureEClass.getESuperTypes().add(this.getTypedElement());
        referenceEClass.getESuperTypes().add(this.getProperty());
        referenceEClass.getESuperTypes().add(this.getTemporaryProperty());
        propertyEClass.getESuperTypes().add(this.getStructuralFeature());
        typedElementEClass.getESuperTypes().add(this.getNamedElement());
        gateEClass.getESuperTypes().add(this.getMessageEnd());
        gateEClass.getESuperTypes().add(this.getNamedElement());
        literalBooleanEClass.getESuperTypes().add(this.getLiteralSpecification());
        g1 = createEGenericType(theCorePackage.getCOREMapping());
        g2 = createEGenericType(this.getClassifier());
        g1.getETypeArguments().add(g2);
        classifierMappingEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theCorePackage.getCOREMapping());
        g2 = createEGenericType(this.getAttribute());
        g1.getETypeArguments().add(g2);
        attributeMappingEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theCorePackage.getCOREMapping());
        g2 = createEGenericType(this.getOperation());
        g1.getETypeArguments().add(g2);
        operationMappingEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theCorePackage.getCOREMapping());
        g2 = createEGenericType(this.getParameter());
        g1.getETypeArguments().add(g2);
        parameterMappingEClass.getEGenericSuperTypes().add(g1);
        stateViewEClass.getESuperTypes().add(this.getNamedElement());
        transitionEClass.getESuperTypes().add(this.getNamedElement());
        stateEClass.getESuperTypes().add(this.getNamedElement());
        rDoubleEClass.getESuperTypes().add(this.getPrimitiveType());
        rFloatEClass.getESuperTypes().add(this.getPrimitiveType());
        transitionSubstitutionEClass.getESuperTypes().add(this.getSubstitution());
        typeParameterEClass.getESuperTypes().add(this.getType());
        rLongEClass.getESuperTypes().add(this.getPrimitiveType());
        rArrayEClass.getESuperTypes().add(this.getPrimitiveType());
        wovenAspectEClass.getESuperTypes().add(this.getNamedElement());
        literalNullEClass.getESuperTypes().add(this.getLiteralSpecification());
        enumLiteralValueEClass.getESuperTypes().add(this.getValueSpecification());
        assignmentStatementEClass.getESuperTypes().add(this.getInteractionFragment());

        // Initialize classes and features; add operations and parameters
        initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAspect_StructuralView(), this.getStructuralView(), null, "structuralView", null, 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAspect_MessageViews(), this.getAbstractMessageView(), null, "messageViews", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getAspect_Instantiations(), this.getInstantiation(), null, "instantiations", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAspect_Layout(), this.getLayout(), null, "layout", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAspect_StateViews(), this.getStateView(), null, "stateViews", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAspect_WovenAspects(), this.getWovenAspect(), null, "wovenAspects", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mappableElementEClass, MappableElement.class, "MappableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(structuralViewEClass, StructuralView.class, "StructuralView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStructuralView_Classes(), this.getClassifier(), null, "classes", null, 0, -1, StructuralView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStructuralView_Associations(), this.getAssociation(), null, "associations", null, 0, -1, StructuralView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStructuralView_Types(), this.getType(), null, "types", null, 0, -1, StructuralView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(classEClass, ca.mcgill.sel.ram.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClass_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, ca.mcgill.sel.ram.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, ca.mcgill.sel.ram.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(associationEndEClass, AssociationEnd.class, "AssociationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAssociationEnd_Navigable(), ecorePackage.getEBoolean(), "navigable", "true", 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociationEnd_Assoc(), this.getAssociation(), this.getAssociation_Ends(), "assoc", null, 1, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociationEnd_Classifier(), this.getClassifier(), this.getClassifier_AssociationEnds(), "classifier", null, 1, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociationEnd_FeatureSelection(), theCorePackage.getCOREModelReuse(), null, "featureSelection", null, 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        addEOperation(associationEndEClass, this.getType(), "getType", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(associationEndEClass, this.getAssociationEnd(), "getOppositeEnd", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssociation_Ends(), this.getAssociationEnd(), this.getAssociationEnd_Assoc(), "ends", null, 2, 2, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(instantiationEClass, Instantiation.class, "Instantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInstantiation_Type(), this.getInstantiationType(), "type", "Depends", 1, 1, Instantiation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOperation_Abstract(), ecorePackage.getEBoolean(), "abstract", "false", 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_ExtendedVisibility(), this.getRAMVisibilityType(), "extendedVisibility", "public", 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperation_ReturnType(), this.getType(), null, "returnType", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperation_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_Static(), ecorePackage.getEBoolean(), "static", "false", 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_OperationType(), this.getOperationType(), "operationType", "Normal", 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAttribute_Type(), this.getPrimitiveType(), null, "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParameter_Type(), this.getType(), null, "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(objectTypeEClass, ObjectType.class, "ObjectType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rVoidEClass, RVoid.class, "RVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(rVoidEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(rBooleanEClass, RBoolean.class, "RBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(rBooleanEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(rBooleanEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(rIntEClass, RInt.class, "RInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(rIntEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(rIntEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(rCharEClass, RChar.class, "RChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(rCharEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(rCharEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(rStringEClass, RString.class, "RString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(rStringEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(rStringEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(rAnyEClass, RAny.class, "RAny", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(rAnyEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(rEnumEClass, REnum.class, "REnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getREnum_Literals(), this.getREnumLiteral(), this.getREnumLiteral_Enum(), "literals", null, 1, -1, REnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rEnumLiteralEClass, REnumLiteral.class, "REnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getREnumLiteral_Enum(), this.getREnum(), this.getREnum_Literals(), "enum", null, 1, 1, REnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractMessageViewEClass, AbstractMessageView.class, "AbstractMessageView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractMessageView_AffectedBy(), this.getAspectMessageView(), null, "affectedBy", null, 0, -1, AbstractMessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(messageViewEClass, MessageView.class, "MessageView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMessageView_Specifies(), this.getOperation(), null, "specifies", null, 1, 1, MessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMessageView_Specification(), this.getInteraction(), null, "specification", null, 0, 1, MessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(messageViewReferenceEClass, MessageViewReference.class, "MessageViewReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMessageViewReference_References(), this.getMessageView(), null, "references", null, 1, 1, MessageViewReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteraction_Lifelines(), this.getLifeline(), null, "lifelines", null, 1, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getInteraction_Messages(), this.getMessage(), this.getMessage_Interaction(), "messages", null, 1, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getInteraction_Properties(), this.getReference(), null, "properties", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteraction_FormalGates(), this.getGate(), null, "formalGates", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(aspectMessageViewEClass, AspectMessageView.class, "AspectMessageView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAspectMessageView_Pointcut(), this.getOperation(), null, "pointcut", null, 1, 1, AspectMessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAspectMessageView_Advice(), this.getInteraction(), null, "advice", null, 1, 1, AspectMessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLifeline_Represents(), this.getTypedElement(), null, "represents", null, 1, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeline_CoveredBy(), this.getInteractionFragment(), this.getInteractionFragment_Covered(), "coveredBy", null, 1, -1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMessage_SendEvent(), this.getMessageEnd(), null, "sendEvent", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMessage_ReceiveEvent(), this.getMessageEnd(), null, "receiveEvent", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMessage_Signature(), this.getOperation(), null, "signature", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMessage_AssignTo(), this.getStructuralFeature(), null, "assignTo", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMessage_MessageSort(), this.getMessageSort(), "messageSort", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMessage_Arguments(), this.getParameterValueMapping(), null, "arguments", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMessage_Interaction(), this.getInteraction(), this.getInteraction_Messages(), "interaction", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMessage_Returns(), this.getValueSpecification(), null, "returns", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMessage_SelfMessage(), ecorePackage.getEBoolean(), "selfMessage", "false", 1, 1, Message.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getMessage_LocalProperties(), this.getTemporaryProperty(), null, "localProperties", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(messageEndEClass, MessageEnd.class, "MessageEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMessageEnd_Message(), this.getMessage(), null, "message", null, 1, 1, MessageEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(messageOccurrenceSpecificationEClass, MessageOccurrenceSpecification.class, "MessageOccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(occurrenceSpecificationEClass, OccurrenceSpecification.class, "OccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(destructionOccurrenceSpecificationEClass, DestructionOccurrenceSpecification.class, "DestructionOccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interactionFragmentEClass, InteractionFragment.class, "InteractionFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionFragment_Covered(), this.getLifeline(), this.getLifeline_CoveredBy(), "covered", null, 1, -1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getInteractionFragment_Container(), this.getFragmentContainer(), this.getFragmentContainer_Fragments(), "container", null, 1, 1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(combinedFragmentEClass, CombinedFragment.class, "CombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCombinedFragment_InteractionOperator(), this.getInteractionOperatorKind(), "interactionOperator", null, 1, 1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCombinedFragment_Operands(), this.getInteractionOperand(), null, "operands", null, 1, -1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(originalBehaviorExecutionEClass, OriginalBehaviorExecution.class, "OriginalBehaviorExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(executionStatementEClass, ExecutionStatement.class, "ExecutionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExecutionStatement_Specification(), this.getValueSpecification(), null, "specification", null, 1, 1, ExecutionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionOperandEClass, InteractionOperand.class, "InteractionOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionOperand_InteractionConstraint(), this.getValueSpecification(), null, "interactionConstraint", null, 0, 1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(structuralFeatureValueEClass, StructuralFeatureValue.class, "StructuralFeatureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStructuralFeatureValue_Value(), this.getStructuralFeature(), null, "value", null, 1, 1, StructuralFeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterValueMappingEClass, ParameterValueMapping.class, "ParameterValueMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParameterValueMapping_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ParameterValueMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterValueMapping_Value(), this.getValueSpecification(), null, "value", null, 1, 1, ParameterValueMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParameterValue_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOpaqueExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOpaqueExpression_Language(), ecorePackage.getEString(), "language", null, 1, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(literalSpecificationEClass, LiteralSpecification.class, "LiteralSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLiteralString_Value(), ecorePackage.getEString(), "value", null, 1, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(literalIntegerEClass, LiteralInteger.class, "LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLiteralInteger_Value(), ecorePackage.getEInt(), "value", null, 1, 1, LiteralInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fragmentContainerEClass, FragmentContainer.class, "FragmentContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFragmentContainer_Fragments(), this.getInteractionFragment(), this.getInteractionFragment_Container(), "fragments", null, 1, -1, FragmentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rCollectionEClass, RCollection.class, "RCollection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRCollection_Type(), this.getObjectType(), null, "type", null, 1, 1, RCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        addEOperation(rCollectionEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(rSetEClass, RSet.class, "RSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rSequenceEClass, RSequence.class, "RSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLayout_Containers(), this.getContainerMap(), null, "containers", null, 1, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(containerMapEClass, Map.Entry.class, "ContainerMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContainerMap_Key(), ecorePackage.getEObject(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContainerMap_Value(), this.getElementMap(), null, "value", null, 1, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(elementMapEClass, Map.Entry.class, "ElementMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEReference(getElementMap_Key(), ecorePackage.getEObject(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElementMap_Value(), this.getLayoutElement(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(layoutElementEClass, LayoutElement.class, "LayoutElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLayoutElement_X(), ecorePackage.getEFloat(), "x", null, 1, 1, LayoutElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLayoutElement_Y(), ecorePackage.getEFloat(), "y", null, 1, 1, LayoutElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClassifier_Operations(), this.getOperation(), null, "operations", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getClassifier_AssociationEnds(), this.getAssociationEnd(), this.getAssociationEnd_Classifier(), "associationEnds", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getClassifier_TypeParameters(), this.getTypeParameter(), null, "typeParameters", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getClassifier_SuperTypes(), this.getClassifier(), null, "superTypes", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(implementationClassEClass, ImplementationClass.class, "ImplementationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getImplementationClass_InstanceClassName(), ecorePackage.getEString(), "instanceClassName", null, 1, 1, ImplementationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImplementationClass_Interface(), ecorePackage.getEBoolean(), "interface", null, 1, 1, ImplementationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(temporaryPropertyEClass, TemporaryProperty.class, "TemporaryProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStructuralFeature_Static(), ecorePackage.getEBoolean(), "static", "false", 1, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReference_Type(), this.getObjectType(), null, "type", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_LowerBound(), ecorePackage.getEInt(), "lowerBound", "0", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_ReferenceType(), this.getReferenceType(), "referenceType", "Regular", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(typedElementEClass, this.getType(), "getType", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLiteralBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(classifierMappingEClass, ClassifierMapping.class, "ClassifierMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClassifierMapping_OperationMappings(), this.getOperationMapping(), null, "operationMappings", null, 0, -1, ClassifierMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getClassifierMapping_AttributeMappings(), this.getAttributeMapping(), null, "attributeMappings", null, 0, -1, ClassifierMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeMappingEClass, AttributeMapping.class, "AttributeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(operationMappingEClass, OperationMapping.class, "OperationMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperationMapping_ParameterMappings(), this.getParameterMapping(), null, "parameterMappings", null, 0, -1, OperationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterMappingEClass, ParameterMapping.class, "ParameterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stateViewEClass, StateView.class, "StateView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStateView_StateMachines(), this.getStateMachine(), null, "stateMachines", null, 1, -1, StateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStateView_Specifies(), this.getClassifier(), null, "specifies", null, 1, 1, StateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStateMachine_Start(), this.getState(), null, "start", null, 1, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStateMachine_States(), this.getState(), null, "states", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStateMachine_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStateMachine_Substitutions(), this.getSubstitution(), null, "substitutions", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTransition_EndState(), this.getState(), this.getState_Incomings(), "endState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransition_StartState(), this.getState(), this.getState_Outgoings(), "startState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransition_Signature(), this.getOperation(), null, "signature", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransition_Guard(), this.getConstraint(), null, "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getState_Incomings(), this.getTransition(), this.getTransition_EndState(), "incomings", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_Outgoings(), this.getTransition(), this.getTransition_StartState(), "outgoings", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rDoubleEClass, RDouble.class, "RDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(rDoubleEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(rDoubleEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(rFloatEClass, RFloat.class, "RFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(rFloatEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(rFloatEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConstraint_Specification(), this.getValueSpecification(), null, "Specification", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(substitutionEClass, Substitution.class, "Substitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(transitionSubstitutionEClass, TransitionSubstitution.class, "TransitionSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTransitionSubstitution_From(), this.getTransition(), null, "from", null, 1, 1, TransitionSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransitionSubstitution_To(), this.getTransition(), null, "to", null, 1, -1, TransitionSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typeParameterEClass, TypeParameter.class, "TypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTypeParameter_GenericType(), this.getObjectType(), null, "genericType", null, 0, 1, TypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rLongEClass, RLong.class, "RLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(rLongEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(rLongEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(rArrayEClass, RArray.class, "RArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRArray_Size(), ecorePackage.getEInt(), "size", "-1", 1, 1, RArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRArray_Type(), this.getObjectType(), null, "type", null, 1, 1, RArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        addEOperation(rArrayEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(rArrayEClass, ecorePackage.getEString(), "getInstanceClassName", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(traceableEClass, Traceable.class, "Traceable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(wovenAspectEClass, WovenAspect.class, "WovenAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getWovenAspect_ComesFrom(), this.getAspect(), null, "comesFrom", null, 1, 1, WovenAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWovenAspect_WovenElements(), this.getTraceable(), null, "wovenElements", null, 0, -1, WovenAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWovenAspect_Children(), this.getWovenAspect(), null, "children", null, 0, -1, WovenAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(literalNullEClass, LiteralNull.class, "LiteralNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(enumLiteralValueEClass, EnumLiteralValue.class, "EnumLiteralValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEnumLiteralValue_Value(), this.getREnumLiteral(), null, "value", null, 1, 1, EnumLiteralValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assignmentStatementEClass, AssignmentStatement.class, "AssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssignmentStatement_AssignTo(), this.getStructuralFeature(), null, "assignTo", null, 1, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssignmentStatement_Value(), this.getValueSpecification(), null, "value", null, 1, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(ramVisibilityTypeEEnum, RAMVisibilityType.class, "RAMVisibilityType");
        addEEnumLiteral(ramVisibilityTypeEEnum, RAMVisibilityType.PUBLIC);
        addEEnumLiteral(ramVisibilityTypeEEnum, RAMVisibilityType.PROTECTED);
        addEEnumLiteral(ramVisibilityTypeEEnum, RAMVisibilityType.PRIVATE);
        addEEnumLiteral(ramVisibilityTypeEEnum, RAMVisibilityType.PACKAGE);

        initEEnum(referenceTypeEEnum, ReferenceType.class, "ReferenceType");
        addEEnumLiteral(referenceTypeEEnum, ReferenceType.COMPOSITION);
        addEEnumLiteral(referenceTypeEEnum, ReferenceType.AGGREGATION);
        addEEnumLiteral(referenceTypeEEnum, ReferenceType.REGULAR);

        initEEnum(messageSortEEnum, MessageSort.class, "MessageSort");
        addEEnumLiteral(messageSortEEnum, MessageSort.SYNCH_CALL);
        addEEnumLiteral(messageSortEEnum, MessageSort.CREATE_MESSAGE);
        addEEnumLiteral(messageSortEEnum, MessageSort.DELETE_MESSAGE);
        addEEnumLiteral(messageSortEEnum, MessageSort.REPLY);

        initEEnum(interactionOperatorKindEEnum, InteractionOperatorKind.class, "InteractionOperatorKind");
        addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.ALT);
        addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.OPT);
        addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.LOOP);
        addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.DISRUPTABLE);
        addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.CRITICAL);

        initEEnum(instantiationTypeEEnum, InstantiationType.class, "InstantiationType");
        addEEnumLiteral(instantiationTypeEEnum, InstantiationType.DEPENDS);
        addEEnumLiteral(instantiationTypeEEnum, InstantiationType.EXTENDS);

        initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
        addEEnumLiteral(operationTypeEEnum, OperationType.NORMAL);
        addEEnumLiteral(operationTypeEEnum, OperationType.CONSTRUCTOR);
        addEEnumLiteral(operationTypeEEnum, OperationType.DESTRUCTOR);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/OCL/Import
        createImportAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore
        createEcoreAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
        createPivotAnnotations();
    }
    
    /**
     * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    protected void createImportAnnotations() {
        String source = "http://www.eclipse.org/OCL/Import";
        addAnnotation(this,
                source,
                new String[] {
                    "core", "http://cs.mcgill.ca/sel/core/2.0#/",
                    "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
                });
    }
    
    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";	
        addAnnotation
          (this, 
           source, 
           new String[] {
             "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
             "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
             "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
           });	
        addAnnotation
          (structuralViewEClass, 
           source, 
           new String[] {
             "constraints", "uniqueTypes noTwoClassesWithSameName"
           });	
        addAnnotation
          (classEClass, 
           source, 
           new String[] {
             "constraints", "notSelfSuperType"
           });	
        addAnnotation
          (associationEndEClass, 
           source, 
           new String[] {
             "constraints", "uniqueName"
           });	
        addAnnotation
          (namedElementEClass, 
           source, 
           new String[] {
             "constraints", "validName"
           });	
        addAnnotation
          (instantiationEClass, 
           source, 
           new String[] {
             "constraints", "aspectCannotMapSelf"
           });	
        addAnnotation
          (operationEClass, 
           source, 
           new String[] {
             "constraints", "messageViewDefined correctVisibility"
           });	
        addAnnotation
          (parameterEClass, 
           source, 
           new String[] {
             "constraints", "notVoid"
           });	
        addAnnotation
          (messageViewEClass, 
           source, 
           new String[] {
             "constraints", "specifiesIsFirstMessage specificationDefined isAffectedBy"
           });	
        addAnnotation
          (messageViewReferenceEClass, 
           source, 
           new String[] {
             "constraints", "isAffectedBy"
           });	
        addAnnotation
          (aspectMessageViewEClass, 
           source, 
           new String[] {
             "constraints", "notAffectedBySelf"
           });	
        addAnnotation
          (messageEClass, 
           source, 
           new String[] {
             "constraints", "validSelfMessage argumentsSpecified createMessageIsFirst returnsSpecified boundariesNotCrossed validReturns deleteMessageIsLast assignToAllowed noCrossingMessages"
           });	
        addAnnotation
          (interactionFragmentEClass, 
           source, 
           new String[] {
             "constraints", "validCoveredMultiplicity"
           });	
        addAnnotation
          (combinedFragmentEClass, 
           source, 
           new String[] {
             "constraints", "validOperands"
           });	
        addAnnotation
          (propertyEClass, 
           source, 
           new String[] {
             "constraints", "validUpperBound validLowerBound validMultiplicity"
           });
    }
    
    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createPivotAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
        addAnnotation
          (structuralViewEClass, 
           source, 
           new String[] {
             "uniqueTypes", "Tuple {\n\tmessage : String = \'There may be only one type of the same type\',\n\tstatus : Boolean = self.types->isUnique(name)\n}.status",
             "noTwoClassesWithSameName", "Tuple {\n\tmessage : String = \'Name of a class has to be unique\',\n\tstatus : Boolean = self.classes->isUnique(name)\n}.status"
           });	
        addAnnotation
          (classEClass, 
           source, 
           new String[] {
             "notSelfSuperType", "Tuple {\n\tmessage : String = \'A class may not be it\\\'s own supertype\',\n\tstatus : Boolean = not self.superTypes->includes(self)\n}.status"
           });	
        addAnnotation
          (associationEndEClass, 
           source, 
           new String[] {
             "uniqueName", "Tuple {\n\tmessage : String = \'AssociationEnds of a class must be unique\',\n\tstatus : Boolean = self.classifier.associationEnds->select(associationEnd : AssociationEnd | associationEnd.name <> null and associationEnd.name <> \'\')->isUnique(name)\n}.status"
           });	
        addAnnotation
          (associationEndEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "self.getOppositeEnd().classifier"
           });	
        addAnnotation
          (associationEndEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "body", "self.assoc.ends->select(end : AssociationEnd | end <> self)->at(1)"
           });	
        addAnnotation
          (namedElementEClass, 
           source, 
           new String[] {
             "validName", "Tuple {\n\tmessage : String = \'Name of RAM elements may not be empty\',\n\tstatus : Boolean = if self.oclIsTypeOf(AssociationEnd) and self.oclAsType(AssociationEnd).navigable = false then true else self.name <> \'\' endif\n}.status"
           });	
        addAnnotation
          (instantiationEClass, 
           source, 
           new String[] {
             "aspectCannotMapSelf", "Tuple {\n\tmessage : String = \'Aspect may not depend on itself\',\n\tstatus : Boolean = not (self.source = self.Aspect)\n}.status"
           });	
        addAnnotation
          (getInstantiation_Type(), 
           source, 
           new String[] {
             "derivation", "if (self.oclContainer().oclIsTypeOf(ram::Aspect)) then InstantiationType::Extends else InstantiationType::Depends endif"
           });	
        addAnnotation
          (operationEClass, 
           source, 
           new String[] {
             "messageViewDefined", "Tuple {\n\tmessage : String = \'MessageView missing for public operation\',\n\tstatus : Boolean = if extendedVisibility = RAMVisibilityType::public and self.Classifier.oclIsTypeOf(Class) and self.partiality = core::COREPartialityType::none then self.Classifier.oclContainer().oclAsType(StructuralView).Aspect.messageViews->select(messageView : AbstractMessageView | messageView.oclIsTypeOf(MessageView))->one(messageView : AbstractMessageView | messageView.oclAsType(MessageView).specifies = self) else true endif\n}.status",
             "correctVisibility", "Tuple {\n\tmessage : String = \'COREVisibility and RAMVisibility attributes are not in sync\',\n\tstatus : Boolean = if visibility = core::COREVisibilityType::public then extendedVisibility = RAMVisibilityType::public else extendedVisibility <> RAMVisibilityType::public endif\n}.status"
           });	
        addAnnotation
          (parameterEClass, 
           source, 
           new String[] {
             "notVoid", "Tuple {\n\tmessage : String = \'The type of the parameter may not be void\',\n\tstatus : Boolean = not self.type.oclIsTypeOf(RVoid)\n}.status"
           });	
        addAnnotation
          (rVoidEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "\'void\'"
           });	
        addAnnotation
          (rBooleanEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "\'boolean\'"
           });	
        addAnnotation
          (rBooleanEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "body", "\'java.lang.Boolean\'"
           });	
        addAnnotation
          (rIntEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "\'int\'"
           });	
        addAnnotation
          (rIntEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "body", "\'java.lang.Integer\'"
           });	
        addAnnotation
          (rCharEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "\'char\'"
           });	
        addAnnotation
          (rCharEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "body", "\'java.lang.Character\'"
           });	
        addAnnotation
          (rStringEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "\'String\'"
           });	
        addAnnotation
          (rStringEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "body", "\'java.lang.String\'"
           });	
        addAnnotation
          (rAnyEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "\'*\'"
           });	
        addAnnotation
          (messageViewEClass, 
           source, 
           new String[] {
             "specifiesIsFirstMessage", "Tuple {\n\tmessage : String = \'The first message in the MessageView must match specifies of the MessageView\',\n\tstatus : Boolean = if not self.specification.oclIsUndefined() and self.specification.messages->size() > 0 then self.specifies = self.specification.messages->select(message : Message | not message.sendEvent.oclIsTypeOf(MessageOccurrenceSpecification))->asOrderedSet()->at(1).signature else true endif\n}.status",
             "specificationDefined", "Tuple {\n\tmessage : String = \'A MessageView for a non-partial operation must have a specification\',\n\tstatus : Boolean = if not self.specifies.oclIsUndefined() then if self.specifies.partiality = core::COREPartialityType::none then not self.specification.oclIsUndefined() else true endif else true endif\n}.status",
             "isAffectedBy", "Tuple {\n\tmessage : String = \'An empty MessageView must have at least one affectedBy\',\n\tstatus : Boolean = if self.specification.oclIsUndefined() and self.specifies.partiality <> core::COREPartialityType::none then self.affectedBy->notEmpty() else true endif\n}.status"
           });	
        addAnnotation
          (messageViewReferenceEClass, 
           source, 
           new String[] {
             "isAffectedBy", "Tuple {\n\tmessage : String = \'The MessageViewReference must have at least one affectedBy\',\n\tstatus : Boolean = self.affectedBy->size() > 0\n}.status"
           });	
        addAnnotation
          (aspectMessageViewEClass, 
           source, 
           new String[] {
             "notAffectedBySelf", "Tuple {\n\tmessage : String = \'Message View may not be affected by itself\',\n\tstatus : Boolean = not self.affectedBy->includes(self)\n}.status"
           });	
        addAnnotation
          (messageEClass, 
           source, 
           new String[] {
             "validSelfMessage", "Tuple {\n\tmessage : String = \'receiveEvent of a self message may not come before the sendEvent\',\n\tstatus : Boolean = if not self.receiveEvent.oclIsUndefined() and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) then let sendEvent : InteractionFragment = self.sendEvent.oclAsType(InteractionFragment) in let receiveEvent : InteractionFragment = self.receiveEvent.oclAsType(InteractionFragment) in if sendEvent.covered->asOrderedSet()->at(1) = receiveEvent.covered->asOrderedSet()->at(1) then sendEvent.container.fragments->indexOf(self.sendEvent) < receiveEvent.container.fragments->indexOf(self.receiveEvent) else true endif else true endif\n}.status",
             "argumentsSpecified", "Tuple {\n\tmessage : String = \'All arguments of the operation must be specified\',\n\tstatus : Boolean = if self.messageSort <> MessageSort::reply and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.signature.oclIsUndefined() then let container : FragmentContainer = self.sendEvent.oclAsType(MessageOccurrenceSpecification).container in if container.fragments->includes(self.sendEvent) then self.signature.parameters->size() = self.arguments->size() and self.signature.parameters->forAll(currentParameter : Parameter | self.arguments->one(argument : ParameterValueMapping | argument.parameter = currentParameter)) else true endif else true endif\n}.status",
             "createMessageIsFirst", "Tuple {\n\tmessage : String = \'The create message occurrence may not come after any other occurrence on this lifeline\',\n\tstatus : Boolean = if self.messageSort = MessageSort::createMessage then if not self.receiveEvent.oclIsUndefined() and not self.receiveEvent.oclAsType(InteractionFragment).covered->isEmpty() then let event : InteractionFragment = self.receiveEvent.oclAsType(InteractionFragment) in event.covered->asOrderedSet()->at(1).coveredBy->forAll(fragment : InteractionFragment | if event.container.fragments->includes(fragment) then event.container.fragments->indexOf(fragment) >= event.container.fragments->indexOf(event) else true endif) else true endif else true endif\n}.status",
             "returnsSpecified", "Tuple {\n\tmessage : String = \'Reply message must have returns specified if return type is not void\',\n\tstatus : Boolean = if self.messageSort = MessageSort::reply then if not self.signature.returnType.oclIsTypeOf(RVoid) and self.signature.operationType = OperationType::Normal then not self.returns.oclIsUndefined() else self.returns.oclIsUndefined() endif else true endif\n}.status",
             "boundariesNotCrossed", "Tuple {\n\tmessage : String = \'Messages may not cross boundaries of CombinedFragments or their operands\',\n\tstatus : Boolean = let send : MessageOccurrenceSpecification = self.sendEvent in let receive : MessageOccurrenceSpecification = self.receiveEvent in if send.container.oclIsTypeOf(InteractionOperand) and receive.container.oclIsTypeOf(InteractionOperand) then send.container.oclAsType(InteractionOperand).CombinedFragment.covered->includes(send.covered->asOrderedSet()->at(1)) and receive.container.oclAsType(InteractionOperand).CombinedFragment.covered->includes(receive.covered->asOrderedSet()->at(1)) else true endif\n}.status",
             "validReturns", "Tuple {\n\tmessage : String = \'Returns may only be specified if message sort is reply message\',\n\tstatus : Boolean = if not self.returns.oclIsUndefined() then self.messageSort = MessageSort::reply else true endif\n}.status",
             "deleteMessageIsLast", "Tuple {\n\tmessage : String = \'The destruction occurrence may not come before any other occurrence on this lifeline\',\n\tstatus : Boolean = if self.messageSort = MessageSort::deleteMessage then if not self.receiveEvent.oclIsUndefined() and not self.receiveEvent.oclAsType(InteractionFragment).covered->isEmpty() then let event : InteractionFragment = self.receiveEvent.oclAsType(InteractionFragment) in event.covered->asOrderedSet()->at(1).coveredBy->forAll(fragment : InteractionFragment | if event.container.fragments->includes(fragment) then event.container.fragments->indexOf(fragment) <= event.container.fragments->indexOf(event) else true endif) else true endif else true endif\n}.status",
             "assignToAllowed", "Tuple {\n\tmessage : String = \'assignTo may not be specified for operations whose return type is void\',\n\tstatus : Boolean = if self.signature.returnType.oclIsTypeOf(RVoid) then self.assignTo = null else true endif\n}.status",
             "noCrossingMessages", "Tuple {\n\tmessage : String = \'Messages may not cross each other, MessageEnds of one message must come one after the other (also, send must come before receive)\',\n\tstatus : Boolean = if not self.receiveEvent.oclIsUndefined() and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) then let container : FragmentContainer = self.receiveEvent.oclAsType(MessageOccurrenceSpecification).container in let indexDifference : Integer = container.fragments->indexOf(self.receiveEvent) - container.fragments->indexOf(self.sendEvent) in indexDifference = 1 else true endif\n}.status"
           });	
        addAnnotation
          (getMessage_SelfMessage(), 
           source, 
           new String[] {
             "derivation", "if self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) then self.sendEvent.oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()->at(1) = self.receiveEvent.oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()->at(1) else false endif"
           });	
        addAnnotation
          (interactionFragmentEClass, 
           source, 
           new String[] {
             "validCoveredMultiplicity", "Tuple {\n\tmessage : String = \'InteractionFragment may only have one Lifeline it covers (except CombinedFragment)\',\n\tstatus : Boolean = if not self.oclIsTypeOf(CombinedFragment) and covered->notEmpty() then covered->size() = 1 else true endif\n}.status"
           });	
        addAnnotation
          (combinedFragmentEClass, 
           source, 
           new String[] {
             "validOperands", "Tuple {\n\tmessage : String = \'opt and loop fragments may only have one operand\',\n\tstatus : Boolean = if self.interactionOperator = InteractionOperatorKind::opt or self.interactionOperator = InteractionOperatorKind::loop or self.interactionOperator = InteractionOperatorKind::critical then self.operands->size() = 1 else true endif\n}.status"
           });	
        addAnnotation
          (rCollectionEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "let partial : String = if type.oclIsTypeOf(Class) or type.oclIsTypeOf(Operation) and type.oclAsType(core::COREModelElement).partiality = core::COREPartialityType::public then \'|\' else if type.oclIsTypeOf(Class) or type.oclIsTypeOf(Operation) and type.oclAsType(core::COREModelElement).partiality = core::COREPartialityType::concern then \'\\u00A6\' else \'\' endif endif in let typeName : String = self.oclType().toString() in let name : String = typeName.substring(typeName.lastIndexOf(\':\') + 2, typeName.size()) in if type.name.oclIsUndefined() then name else name + \'<\' + partial + type.name + \'>\' endif"
           });	
        addAnnotation
          (propertyEClass, 
           source, 
           new String[] {
             "validUpperBound", "Tuple {\n\tmessage : String = \'The upperbound must be greater than zero or -1 representing *\',\n\tstatus : Boolean = self.upperBound > 0 or self.upperBound = -1\n}.status",
             "validLowerBound", "Tuple {\n\tmessage : String = \'The lowerbound must be greater than or equal to zero\',\n\tstatus : Boolean = self.lowerBound >= 0\n}.status",
             "validMultiplicity", "Tuple {\n\tmessage : String = \'The lowerBound must be less than or equal to the upperBound\',\n\tstatus : Boolean = self.lowerBound <= self.upperBound or self.upperBound = -1\n}.status"
           });	
        addAnnotation
          (rDoubleEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "\'double\'"
           });	
        addAnnotation
          (rDoubleEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "body", "\'java.lang.Double\'"
           });	
        addAnnotation
          (rFloatEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "\'float\'"
           });	
        addAnnotation
          (rFloatEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "body", "\'java.lang.Float\'"
           });	
        addAnnotation
          (rLongEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "\'long\'"
           });	
        addAnnotation
          (rLongEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "body", "\'java.lang.Long\'"
           });	
        addAnnotation
          (rArrayEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "body", "if (self.type <> null and self.type.name <> null) then self.type.name + \'[\' + if (self.size >= 0) then self.size.toString() else \'\' endif + \']\' else null endif"
           });	
        addAnnotation
          (rArrayEClass.getEOperations().get(1), 
           source, 
           new String[] {
             "body", "\'java.lang.reflect.Array\'"
           });
    }
    
} // RamPackageImpl
