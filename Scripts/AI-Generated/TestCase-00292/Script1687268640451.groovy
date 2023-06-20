import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-learning-a-testing-career-easy'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-learning-a-testing-career-easy/89057')

'step 2: Add visual checkpoint at Page_t_is-learning-a-testing-career-easy'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00292_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
