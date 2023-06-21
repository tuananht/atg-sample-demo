import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_parsing-soap-xml-response-text'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/parsing-soap-xml-response-text/9634')

'step 2: Add visual checkpoint at Page_t_parsing-soap-xml-response-text'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00013_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()