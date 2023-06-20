import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_problem-to-solve-count-the-number-of-rows-in-a-table'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/problem-to-solve-count-the-number-of-rows-in-a-table/64170')

'step 2: Add visual checkpoint at Page_t_problem-to-solve-count-the-number-of-rows-in-a-table'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00092_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
