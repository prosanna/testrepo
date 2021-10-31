package java5Features.staticImport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author prosannam
 *
 */
public enum InstrumentTypeCategoryIDMapping {

	// @formatter:off
	ST(InstrumentTypeCategory.EQ),
	DR(InstrumentTypeCategory.EQ),
	WA(InstrumentTypeCategory.EQ),
	PS(InstrumentTypeCategory.EQ),
	CD(InstrumentTypeCategory.MM),
	FC(InstrumentTypeCategory.MM),
	CP(InstrumentTypeCategory.MM_CP),
	GB(InstrumentTypeCategory.FI),
	SB(InstrumentTypeCategory.FI),
	WB(InstrumentTypeCategory.FI),
	EW(InstrumentTypeCategory.FI),
	CB(InstrumentTypeCategory.FI),
	WE(InstrumentTypeCategory.FI),
	CR(InstrumentTypeCategory.CR),
	FD(InstrumentTypeCategory.FD);
	
 
// @formatter:on

	private final InstrumentTypeCategory ic;

	/**
	 * 
	 * @param ic
	 */
	private InstrumentTypeCategoryIDMapping(InstrumentTypeCategory ic) {
		this.ic = ic;
	}

	/**
	 * Method to get the default value.
	 * 
	 * @return
	 */
	public String getValue(String id) {
		if (InstrumentTypeCategory.FI.name() == this.ic.name()) {
			return ic.getValue(id);
		}
		
		return ic.getValue();
	}

	/**
	 * Validate Instrument Type
	 * 
	 * @param instrumentType
	 * @return
	 */
	public static boolean isValidInstrumentType(String instrumentType) {
		// @formatter:off
		return Arrays.asList(InstrumentTypeCategoryIDMapping.values())
				 .stream()
				 .anyMatch(x -> x.name().equals(instrumentType)); 
// @formatter:on

	}

	private enum InstrumentTypeCategory {
		// @formatter:off
		EQ("100"), 
		MM("310"), 
		MM_CP("320"),
		FI(FRN_SEC_SPCL_ID2.A, 
				FRN_SEC_SPCL_ID2.B, 
				FRN_SEC_SPCL_ID2.C, 
				FRN_SEC_SPCL_ID2.D, 
				FRN_SEC_SPCL_ID2.E,
				FRN_SEC_SPCL_ID2.F, 
				FRN_SEC_SPCL_ID2.G, 
				FRN_SEC_SPCL_ID2.H, 
				FRN_SEC_SPCL_ID2.Z,
				FRN_SEC_SPCL_ID2.DEFAULT),
		CR("399"),
		FD("160");
 
// @formatter:on

		private final String value;
		private final List<FRN_SEC_SPCL_ID2> id2ValueList;

		/**
		 * 
		 * @param value
		 */
		private InstrumentTypeCategory(String value) {
			this.value = value;
			this.id2ValueList = new ArrayList<>();// default
		}

		private InstrumentTypeCategory(FRN_SEC_SPCL_ID2... id2ValueList) {
			this.value = "";// default
			this.id2ValueList = Arrays.asList(id2ValueList);
		}

		/**
		 * 
		 * @return
		 */		
		
		public String getValue() {
			return value;

		}		 

		/**
		 * 
		 * @param id
		 * @return
		 */
		public String getValue(String id) {
			if (FRN_SEC_SPCL_ID2.isValidFRN_SEC_SPCL_ID2(id)) {
				if (id2ValueList.contains(FRN_SEC_SPCL_ID2.valueOf(id))) {
					return FRN_SEC_SPCL_ID2.valueOf(id).getVal();
				}
			}
			return value;

		}

	}

	private enum FRN_SEC_SPCL_ID2 {
		// @formatter:off
		A("210"),
		B("220"),
		C("230"),
		D("240"),
		E("290"),
		F("399"),
		G("290"),
		H("399"),
		Z("399"),
		DEFAULT("399");

	//@formatter:on

		private final String val;

		private FRN_SEC_SPCL_ID2(String val) {
			this.val = val;
		}

		public String getVal() {
			return val;
		}

		public static boolean isValidFRN_SEC_SPCL_ID2(String id) {
			// @formatter:off
			return Arrays.asList(FRN_SEC_SPCL_ID2.values())
							 .stream()
							 .anyMatch(x -> x.name().equals(id)); 
	// @formatter:on}
		}

	}
}
