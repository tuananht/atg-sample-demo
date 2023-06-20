import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-i-just-lost-all-my-test-cases-what-do-i-do-now'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-i-just-lost-all-my-test-cases-what-do-i-do-now/53919')

'step 2: Add visual checkpoint at Page_t_how-to-i-just-lost-all-my-test-cases-what-do-i-do-now'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00482_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
