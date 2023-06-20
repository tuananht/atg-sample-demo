import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_when-static-methods-should-be-used-in-custom-keywords'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/when-static-methods-should-be-used-in-custom-keywords/52116')

'step 2: Add visual checkpoint at Page_t_when-static-methods-should-be-used-in-custom-keywords'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00274_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
