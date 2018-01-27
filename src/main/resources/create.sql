-- h2 - Compatibility modes Oracle
--	Oracle Compatibility Mode
--	
--	To use the Oracle mode, use the database URL jdbc:h2:~/test;MODE=Oracle or the SQL statement SET MODE Oracle.
--	
--	    For aliased columns, ResultSetMetaData.getColumnName() returns the alias name and getTableName() returns null.
--	    When using unique indexes, multiple rows with NULL in all columns are allowed, however it is not allowed to have multiple rows with the same values otherwise.
--	    Concatenating NULL with another value results in the other value.
--	    Empty strings are treated like NULL values. 
--
--	http://www.h2database.com/html/features.html#feature_list
--	Embedded (local) connection 	jdbc:h2:[file:][<path>]<databaseName>
--	Server mode (remote connections) using TCP/IP 	jdbc:h2:tcp://<server>[:<port>]/[<path>]<databaseName>
--													jdbc:h2:tcp://localhost/~/test
--													jdbc:h2:tcp://dbserv:8084/~/sample
--													jdbc:h2:tcp://localhost/mem:test
--	Execute SQL on connection 						jdbc:h2:<url>;INIT=RUNSCRIPT FROM '/tmp/create.sql'
--													jdbc:h2:file:~/sample;INIT=RUNSCRIPT FROM '~/create.sql'\;RUNSCRIPT FROM '~/populate.sql'
--	Compatibility mode 								jdbc:h2:<url>;MODE=<databaseType>
--													jdbc:h2:~/test;MODE=MYSQL 
--
--	jdbc:h2:tcp://localhost:9101//tmp/db;MODE=ORACLE;DB_CLOSE_DELAY=-1;TRACE_LEVEL_FILE=3DB_CLOSE_ON_EXIT=FALSE;DATABASE_TO_UPPER=FALSE;RUNSCRIPT FROM '/tmp/populate.sql';INIT=RUNSCRIPT FROM '/tmp/create.sql
--
--	URL format error; 
--	must be 
--	"jdbc:h2:{ {.|mem:}[name] | [file:]fileName | {tcp|ssl}:[//]server[:port][,server2[:port]]/name }[;key=value...]" 
but is 
"jdbc:h2:tcp://localhost:9101//tmp/h2/REMATRICULAH2/db" [90046-194] 90046/90046 (Help)
--
-- java -jar ~/.m2/repository/com/h2database/h2/1.4.194/h2-1.4.194.jar -tcpPort 9101 -webAllowOthers -tcpAllowOthers -webPort 8888

jdbc:h2:tcp://localhost:9101//tmp/h2/rematricula-db;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE;MODE=ORACLE;DATABASE_TO_UPPER=FALSE;TRACE_LEVEL_FILE=3;INIT=RUNSCRIPT FROM '/tmp/create.sql'

DROP SCHEMA ACD;
CREATE SCHEMA ACD;

--------------------------------------------------------
--  DDL for Table IES
--------------------------------------------------------

  CREATE TABLE ACD.IES (
	ID BYTEA PRIMARY KEY, 
	COD_EMPR NUMBER(2,0), 
	RZ_SOCIA VARCHAR2(550), 
	NM_FANTA VARCHAR2(350), 
	N_REITOR VARCHAR2(350), 
	NM_ABREV VARCHAR2(20), 
	EMPR_RM NUMBER(2,0), 
	DES_RECO VARCHAR2(100), 
	COD_ENAD NUMBER(6,0), 
	N_PROREI VARCHAR2(50), 
	RG_PROREI VARCHAR2(20), 
	NR_SEQRC NUMBER(6,0), 
	WEB_SITE VARCHAR2(60), 
	ATIVA_RM NUMBER(1,0), 
	NM_ABREV5 VARCHAR2(50), 
	DIAS_AVCTO NUMBER(4,0), 
	DIR_FOTO VARCHAR2(30), 
	PERC_ISS NUMBER(4,2), 
	PVLSEMSER NUMBER(1,0), 
	RZ_ANT VARCHAR2(550), 
	SIT_CADA NUMBER(1,0), 
	CN_CODIES NUMBER(6,0), 
	TIPO_FAT NUMBER(1,0), 
	VCTO_MAT NUMBER(1,0), 
	TIPO_ENS NUMBER(1,0), 
	ENV_REMBCO NUMBER(1,0), 
	BOLMAT_WEB NUMBER(1,0), 
	NM_ABREV10 VARCHAR2(10), 
	P_RECAL_POS NUMBER(1,0), 
	GRU_SPED NUMBER(1,0), 
	CODCOLIGADA_RM NUMBER(5,0), 
	CODCFO VARCHAR2(250), 
	ARQ_LOGO VARCHAR2(50), 
	CB_FAZ_ANTEC VARCHAR2(100), 
	CB_FAZ_FATUR VARCHAR2(100), 
	CB_FAZ_BAIXA VARCHAR2(100), 
	CB_MES_ANO_FAT DATE, 
	CB_MES_ANO_ANT DATE, 
	CB_MES_ANO_BAI DATE, 
	CB_DATA_ALT DATE, 
	EMP_GRUP NUMBER(2,0), 
	NOME_EMP_CV VARCHAR2(20), 
	TAM_ABB NUMBER(2,0), 
	DISC_TT NUMBER(5,0), 
	DT_INI_CTB DATE, 
	ID_PPROF NUMBER(5,0), 
	ID_PCOORD NUMBER(5,0), 
	GER_DISMAT NUMBER(1,0), 
	CAL_VALMAT NUMBER(1,0), 
	CTA_CTB_FAT VARCHAR2(20), 
	CTA_CTB_FAT_DESC1 VARCHAR2(20), 
	CTA_CTB_FAT_DESC2 VARCHAR2(20), 
	CTA_CTB_CAR VARCHAR2(20),
	DISC_NOLP NUMBER(5,0), 
	CTA_CTB_ANT_1SEM VARCHAR2(20),
	CTA_CTB_ANT_2SEM VARCHAR2(20),
	QTD_ALU_OFER NUMBER(3,0), 
	CTA_CTB_CR VARCHAR2(20), 
	CTA_CTB_CAN VARCHAR2(20), 
	PERC_PIS NUMBER(4,2), 
	PERC_COFINS NUMBER(4,2), 
	USA_POEB VARCHAR2(100),
	LOJ_CREDEN NUMBER(10,0), 
	GINFES NUMBER(1,0)
);

--------------------------------------------------------
--  DDL for Table OFERTA
--------------------------------------------------------

  CREATE TABLE ACD.OFERTA (
	ID BYTEA PRIMARY KEY, 
    ID_OFERT NUMBER(8,0), 
	COD_EMPR NUMBER(2,0), 
	COD_DISC NUMBER(5,0), 
	ANO_LETI NUMBER(4,0), 
	SEM_LETI NUMBER(1,0), 
	COD_INST NUMBER(2,0), 
	NR_SALA VARCHAR2(150), 
	PERIODO NUMBER(1,0), 
	HOR_OFER NUMBER(1,0), 
	GRU_DISC NUMBER(1,0), 
	PAR_PRES NUMBER(3,0), 
	DES_OFER VARCHAR2(50), 
	TOT_VAGA NUMBER(5,0), 
	CARG_HOR NUMBER(3,0), 
	SIT_OFER NUMBER(1,0), 
	DISC_CTE VARCHAR2(100), 
	DT_IMPORT DATE, 
	CH VARCHAR2(20), 
	TIP_OFER NUMBER(2,0), 
	COD_HORA NUMBER(4,0), 
	OBSERVAC VARCHAR2(100), 
	SIT_PGL NUMBER(1,0), 
	VAGA_OPT NUMBER(3,0), 
	TRI_LETI NUMBER(1,0), 
	TIPO_MET NUMBER(1,0), 
	VAGA_CRE NUMBER(3,0), 
	OFE_OBRI NUMBER(1,0), 
	SEQ_OFEM NUMBER(2,0), 
	SIT_MIG NUMBER(1,0), 
	DATA_CAD DATE
);

--------------------------------------------------------
--  DDL for Table CAMPUS
--------------------------------------------------------

  CREATE TABLE ACD.CAMPUS (
	ID BYTEA PRIMARY KEY, 
	COD_EMPR NUMBER(2,0), 
	COD_FILI NUMBER(1,0), 
	NOM_FILI VARCHAR2(350), 
	CGC_MF NUMBER(14,0), 
	INSC_EST VARCHAR2(1200), 
	ENDERECO VARCHAR2(350), 
	BAIRRO VARCHAR2(20), 
	CIDADE VARCHAR2(20), 
	ESTADO VARCHAR2(200), 
	CEP NUMBER(8,0), 
	FONE VARCHAR2(140), 
	DIRETOR VARCHAR2(350), 
	RG_DIR VARCHAR2(90), 
	NM_SECRE VARCHAR2(350), 
	RG_SECRE VARCHAR2(150), 
	FEC_LIVR NUMBER(2,0), 
	PAG_LIVR NUMBER(3,0), 
	SEQ_LIVR NUMBER(5,0), 
	COD_INST NUMBER(2,0), 
	CAMPUS VARCHAR2(40), 
	ABR_INST VARCHAR2(60), 
	SENH_PDV NUMBER(4,0), 
	SIT_PDVS NUMBER(1,0), 
	DTA_MOVI DATE, 
	COD_ACSP NUMBER(8,0), 
	FILI_RM NUMBER(2,0), 
	DIAS_CBP NUMBER(2,0), 
	COLI_RM NUMBER(2,0), 
	NRO_END VARCHAR2(60), 
	COD_INEP NUMBER(12,0), 
	CGC_ANT NUMBER(14,0), 
	DTA_CGC DATE, 
	ABR_INST_BI VARCHAR2(40), 
	SIT_CADA NUMBER(1,0), 
	COD_MUNI VARCHAR2(10), 
	CODIGO_UF NUMBER(2,0), 
	TITU_SECRE VARCHAR2(20), 
	CUE_PRON NUMBER(5,0), 
	CXA_EXIST NUMBER(1,0), 
	FUND_LEGAL VARCHAR2(300), 
	ARQ_LOGO VARCHAR2(50), 
	DES_MANT VARCHAR2(100), 
	DES_RECO VARCHAR2(100), 
	NOME_INS VARCHAR2(100), 
	GRP_CONT NUMBER(3,0), 
	COD_ENAD NUMBER(6,0), 
	LOJ_CREDEN NUMBER(10,0), 
	INSC_NUM VARCHAR2(150), 
	GERA_REM_BOL NUMBER(1,0), 
	DIAS_VCTO_BOL NUMBER(2,0)
);

--------------------------------------------------------
--  DDL for Table ALUNO
--------------------------------------------------------

  CREATE TABLE ACD.ALUNO (
	ID BYTEA PRIMARY KEY, 
	COD_ALUN NUMBER(10,0), 
	NOME VARCHAR2(80), 
	SEXO NUMBER(1,0), 
	DTA_NASC DATE, 
	ES_CIVIL NUMBER(1,0), 
	NACIONAL VARCHAR2(150), 
	NAT_CIDA VARCHAR2(30), 
	NAT_UF VARCHAR2(200), 
	PAI_ALUN VARCHAR2(50), 
	MAE_ALUN VARCHAR2(50), 
	FONE_RES VARCHAR2(30), 
	FONE_COM VARCHAR2(30), 
	FONE_CEL VARCHAR2(30), 
	CPF_ALUN NUMBER(11,0), 
	RG_NR VARCHAR2(20), 
	RG_UFEMI VARCHAR2(200), 
	DATA_RG DATE, 
	ELEIT_NR NUMBER(15,0), 
	ELEIT_ZN NUMBER(3,0), 
	ELEIT_SC NUMBER(4,0), 
	RESER_NR VARCHAR2(30), 
	RESER_TP VARCHAR2(30), 
	RG_ESCOL VARCHAR2(20), 
	UF_RGESC VARCHAR2(200), 
	E_MAIL VARCHAR2(100), 
	SENHA VARCHAR2(50), 
	ANO_CON2G NUMBER(4,0), 
	COD_RACA NUMBER(1,0), 
	COD_COND NUMBER(2,0), 
	MUN_CNAS VARCHAR2(30), 
	DIS_CNAS VARCHAR2(30), 
	RG_NR_AUX VARCHAR2(160), 
	RM_CODCLI NUMBER(6,0), 
	W_SENHA VARCHAR2(50), 
	SIT_SENHA NUMBER(1,0), 
	KEY_PEARSON VARCHAR2(80), 
	OPER_CEL NUMBER(2,0), 
	CONTAUT NUMBER(1,0) DEFAULT NULL, 
	DDD_FRES NUMBER(3,0), 
	DDD_FCOM NUMBER(3,0), 
	DDD_FCEL NUMBER(3,0), 
	RAM_FCOM NUMBER(4,0), 
	PAIS VARCHAR2(30), 
	ATO_COTE NUMBER(1,0), 
	NOME_FONET VARCHAR2(100), 
	BLO_ACS_PA NUMBER(1,0), 
	ID_IESDE NUMBER(6,0), 
	SENHA_C VARCHAR2(50), 
	ESC_ENSM VARCHAR2(200), 
	IESDE_UNID NUMBER(2,0), 
	RG_ORGAO VARCHAR2(150), 
	E_MAIL_INST VARCHAR2(100), 
	CELU_MAE VARCHAR2(30), 
	CELU_PAI VARCHAR2(30), 
	CELU_OUT VARCHAR2(30), 
	GEN_RGORGAO NUMBER(1,0), 
	TIP_ESCO NUMBER, 
	NOME_REG VARCHAR2(100), 
	COD_PAIS NUMBER(4,0), 
	DOC_RNE VARCHAR2(20), 
	NPASSAPORTE VARCHAR2(20)
);

--------------------------------------------------------
--  DDL for Table CURSOS
--------------------------------------------------------

  CREATE TABLE ACD.CURSOS (
	ID BYTEA PRIMARY KEY, 
	COD_EMPR NUMBER(2,0), 
	COD_CURS NUMBER(4,0), 
	DES_CURS VARCHAR2(60), 
	DES_CUR2 VARCHAR2(100), 
	ABR_CURS VARCHAR2(10), 
	SIT_CURS NUMBER(1,0), 
	COD_CENT NUMBER(2,0), 
	DES_CUR3 VARCHAR2(100), 
	DES_CUR4 VARCHAR2(350), 
	PERCE_SP NUMBER(4,2), 
	TIPO_CUR NUMBER(1,0), 
	CENT_CUS VARCHAR2(150), 
	TIPO_REG NUMBER(1,0), 
	AREA_CUR VARCHAR2(100), 
	CURS_ANT NUMBER(3,0), 
	CONT_EAD CLOB, 
	CURS_EAD NUMBER(3,0), 
	OBJ_EAD VARCHAR2(4000), 
	PUB_EAD VARCHAR2(1000), 
	DOC_NESC VARCHAR2(1000), 
	PRE_REQ VARCHAR2(3000), 
	DISC_AMB NUMBER(5,0), 
	COD_CUR_UNF NUMBER(3,0), 
	DTI_AULA DATE, 
	DTF_AULA DATE, 
	CURS_UNF2 NUMBER(3,0), 
	CURS_UNF3 NUMBER(3,0), 
	SOBR_CUR VARCHAR2(3000), 
	MERC_TRA VARCHAR2(3000), 
	COD_PLAN_VES NUMBER(3,0), 
	INF_COMP VARCHAR2(3000), 
	CURS_R2 NUMBER(1,0), 
	CCUR_PRON NUMBER(6,0), 
	DESC_MKT VARCHAR2(100), 
	OFER_PBL NUMBER(1,0), 
	ID_SETOR NUMBER(3,0), 
	COD_MIGR VARCHAR2(30), 
	AT_LEGAL VARCHAR2(500), 
	DURA_CUR_MKT NUMBER(2,0)
);

--------------------------------------------------------
--  DDL for Table TURMA
--------------------------------------------------------
  CREATE TABLE ACD.TURMA (
	ID BYTEA PRIMARY KEY, 
    COD_INST NUMBER(2,0), 
	COD_TURM NUMBER(6,0), 
	ANO_TURM NUMBER(4,0), 
	SEM_TURM NUMBER(1,0), 
	COD_CURS NUMBER(3,0), 
	COD_HABI NUMBER(2,0), 
	SERIE NUMBER(2,0), 
	TURMA VARCHAR2(30), 
	PERIODO NUMBER(1,0), 
	NUM_VAGA NUMBER(3,0), 
	TIPO_TUR NUMBER(1,0), 
	NR_SALA VARCHAR2(150), 
	NR_CLASS NUMBER(9,0), 
	UNIDADE NUMBER(1,0), 
	CARG_DOP NUMBER(3,0), 
	TUR_TRAN NUMBER(1,0), 
	TRI_INGR NUMBER(1,0), 
	SEQ_GRAD NUMBER(6,0), 
	TUR_POST NUMBER(6,0), 
	BLO_MATR NUMBER(1,0), 
	DAT_INIC DATE, 
	DAT_FINA DATE, 
	ID_EDITPRO NUMBER(3,0)
);

  CREATE TABLE ACD.TURALU (
	ID BYTEA PRIMARY KEY, 
    COD_ALUN NUMBER(10,0), 
	COD_INST NUMBER(2,0), 
	COD_TURM NUMBER(6,0), 
	DAT_MATR DATE, 
	SIT_MATR NUMBER(1,0), 
	DTA_SITU DATE, 
	DTA_FREQ DATE, 
	OBSERVAC VARCHAR2(1000), 
	RGM_ALUN NUMBER(8,0), 
	SEQ_GRAD NUMBER(6,0), 
	ID_POLO NUMBER(4,0), 
	ID_POLOCAP NUMBER(4,0), 
	ID_TURALU NUMBER(12,0)
);

  CREATE TABLE ACD.TURDIS (
	ID BYTEA PRIMARY KEY, 
    COD_INST NUMBER(2,0), 
	COD_TURM NUMBER(6,0), 
	COD_DISC NUMBER(4,0), 
	TIP_DISC NUMBER(1,0), 
	GRU_DISC NUMBER(1,0), 
	NR_SALA VARCHAR2(60), 
	LIB_NEAD NUMBER(1,0), 
	TIP_PRES NUMBER(1,0), 
	TRI_LETI NUMBER(1,0), 
	SEQ_OFEM NUMBER(2,0), 
	DISC_ANT NUMBER(5,0)
);

  CREATE TABLE ACD.TURELE (
	ID BYTEA PRIMARY KEY, 
    COD_ELET NUMBER(8,0), 
	COD_INST NUMBER(2,0), 
	COD_TURM NUMBER(6,0), 
	COD_DISC NUMBER(4,0), 
	DIA_SEMA NUMBER(1,0), 
	SEQ_AULA NUMBER(2,0), 
	ANO_LETI NUMBER(4,0), 
	SEM_LETI NUMBER(2,0), 
	COD_CURS NUMBER(3,0), 
	COD_HABI NUMBER(3,0), 
	SERIE NUMBER(2,0), 
	PERIODO NUMBER(1,0), 
	HORA_INI NUMBER(4,0), 
	CARG_HOR NUMBER(3,0), 
	QTD_CRED NUMBER(2,0), 
	TIPO_TUR NUMBER(1,0)
);

  CREATE TABLE ACD.TUREST (
	ID BYTEA PRIMARY KEY, 
    INST_CUR NUMBER(1,0), 
	COD_CURS NUMBER(2,0), 
	COD_DISC NUMBER(4,0), 
	TURMA VARCHAR2(200), 
	COD_PROF NUMBER(6,0), 
	SERIE NUMBER(2,0)
);

--------------------------------------------------------
--  DDL for Table GRADE
--------------------------------------------------------

  CREATE TABLE ACD.GRADE (
	ID BYTEA PRIMARY KEY, 
	COD_EMPR NUMBER(2,0), 
	COD_CURS NUMBER(3,0), 
	COD_HABI NUMBER(2,0), 
	SEQ_GRAD NUMBER(6,0), 
	SERIE NUMBER(2,0), 
	ANO_INIC NUMBER(4,0), 
	SEM_INIC NUMBER(1,0), 
	TIP_GRAD NUMBER(1,0)
);

--------------------------------------------------------
--  DDL for Table DISCIPLINA
--------------------------------------------------------
  CREATE TABLE ACD.DISCIPLINA (
	ID BYTEA PRIMARY KEY, 
	COD_EMPR NUMBER(2,0), 
	COD_DISC NUMBER(5,0), 
	DES_DISC VARCHAR2(80), 
	ABR_DISC VARCHAR2(20), 
	COD_HIST NUMBER(3,0), 
	COD_LECI NUMBER(3,0), 
	CUR_RESP NUMBER(3,0), 
	CARG_HOR NUMBER(4,0), 
	TIP_DISC NUMBER(2,0), 
	CONT_FAL NUMBER(1,0), 
	TIPO_AVA NUMBER(1,0), 
	PARCE_OL NUMBER(3,0), 
	TIP_CARG NUMBER(1,0), 
	QTD_AULA NUMBER(2,0), 
	QTD_CRED NUMBER(3,0), 
	SIT_DISC NUMBER(1,0), 
	FONETICA VARCHAR2(100), 
	TIP_UNCD NUMBER(2,0), 
	TIPO_CV NUMBER(2,0), 
	WEB_ESTG NUMBER(1,0), 
	COD_MIGR VARCHAR2(10), 
	NOME_COMP VARCHAR2(200), 
	PROF_RES VARCHAR2(20), 
	PROF_RPE VARCHAR2(20), 
	PROF_RQP VARCHAR2(20), 
	PROF_RRO VARCHAR2(20), 
	DISC_PRI NUMBER(1,0), 
	PROF_RRT VARCHAR2(20), 
	DISC_SBB NUMBER(1,0), 
	TIP_PBL NUMBER(1,0), 
	ORDHIST NUMBER
);

  CREATE TABLE ACD.DISALU (
	ID BYTEA PRIMARY KEY, 
	COD_INST NUMBER(2,0), 
	RGM_ALUN NUMBER(8,0), 
	SEQ_DISC NUMBER(4,0), 
	INS_CURS NUMBER(2,0), 
	TUR_CURS NUMBER(6,0), 
	COD_DISC NUMBER(4,0), 
	DIS_EQUI NUMBER(4,0), 
	DIA_SEMA NUMBER(2,0), 
	SEQ_AULA NUMBER(2,0), 
	HORARIO NUMBER(4,0), 
	SERIE NUMBER(2,0), 
	CARG_HOR NUMBER(3,0), 
	QTD_CRED NUMBER(2,0), 
	GRUP_EQU NUMBER(2,0), 
	DISC_GRA NUMBER(4,0), 
	PRE_REQU VARCHAR2(100), 
	TIPO_DIS NUMBER(1,0), 
	GRU_DISC NUMBER(1,0), 
	DATA_CAD DATE, 
	COD_ELET NUMBER(8,0), 
	TIP_PRES NUMBER(1,0), 
	DISC_OPT VARCHAR2(100)
);

  CREATE TABLE ACD.DISCDPUNF (
	ID BYTEA PRIMARY KEY, 
	COD_EMPR NUMBER(2,0), 
	COD_CURS NUMBER(3,0), 
	COD_DISC NUMBER(5,0), 
	ANO_LETI NUMBER(4,0), 
	SEM_LETI NUMBER(2,0), 
	QTD_ALUN NUMBER(4,0)
);

  CREATE TABLE ACD.DISCHQ (
	ID BYTEA PRIMARY KEY, 
	COD_INST NUMBER(1,0), 
	RGM_ALUN NUMBER(8,0), 
	SEQ_DISC NUMBER(3,0), 
	SEQ_DCHQ NUMBER(3,0)
);