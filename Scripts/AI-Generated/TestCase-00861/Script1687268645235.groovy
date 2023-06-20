import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-follow-xsd-references-from-wsdl-for-schema-compliance-validation'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-follow-xsd-references-from-wsdl-for-schema-compliance-validation/86309')

'step 2: Add visual checkpoint at Page_t_how-to-follow-xsd-references-from-wsdl-for-schema-compliance-validation'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00861_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
