import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_reason-groovy-lang-missingmethodexception-no-signature-of-method-static-com-kms-katalon-core-webservice-keyword-wsbuiltinkeywords-sendrequest-is-applicable-for-argument-types-com-kms-katalon-core-testobject-requestobject-java-util-linkedhashmap'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/reason-groovy-lang-missingmethodexception-no-signature-of-method-static-com-kms-katalon-core-webservice-keyword-wsbuiltinkeywords-sendrequest-is-applicable-for-argument-types-com-kms-katalon-core-testobject-requestobject-java-util-linkedhashmap/52347')

'step 2: Add visual checkpoint at Page_t_reason-groovy-lang-missingmethodexception-no-signature-of-method-static-com-kms-katalon-core-webservice-keyword-wsbuiltinkeywords-sendrequest-is-applicable-for-argument-types-com-kms-katalon-core-testobject-requestobject-java-util-linkedhashmap'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00041_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
