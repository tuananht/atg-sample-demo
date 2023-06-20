import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_broken-text-labels-in-tabs-eclipse-bug'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/broken-text-labels-in-tabs-eclipse-bug/47343')

'step 2: Add visual checkpoint at Page_t_broken-text-labels-in-tabs-eclipse-bug'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00461_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
