import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_recap-how-to-do-mobile-test-automation-at-scale-with-22'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/recap-how-to-do-mobile-test-automation-at-scale-with-katalon/89202/22')

'step 2: Add visual checkpoint at Page_t_recap-how-to-do-mobile-test-automation-at-scale-with-22'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00160_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
