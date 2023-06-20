import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-cases-are-failing-while-running-it-using-headless-mode'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-cases-are-failing-while-running-it-using-headless-mode/82116')

'step 2: Add visual checkpoint at Page_t_test-cases-are-failing-while-running-it-using-headless-mode'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00824_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
