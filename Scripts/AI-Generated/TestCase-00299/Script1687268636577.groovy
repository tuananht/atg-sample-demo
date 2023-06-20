import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_creating-a-random-string-int-during-run-time-to-use-in-a-web-request'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/creating-a-random-string-int-during-run-time-to-use-in-a-web-request/12453')

'step 2: Add visual checkpoint at Page_t_creating-a-random-string-int-during-run-time-to-use-in-a-web-request'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00299_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
