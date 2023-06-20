import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_recognize-elements-on-a-new-page'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/recognize-elements-on-a-new-page/42279')

'step 2: Add visual checkpoint at Page_t_recognize-elements-on-a-new-page'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00908_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
