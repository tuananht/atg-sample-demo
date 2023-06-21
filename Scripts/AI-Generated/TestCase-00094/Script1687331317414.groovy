import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-groovy-javascript-css-using-css-selectors-in-javascript-in-groovy-in-test-cases'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-groovy-javascript-css-using-css-selectors-in-javascript-in-groovy-in-test-cases/34488')

'step 2: Add visual checkpoint at Page_t_how-to-groovy-javascript-css-using-css-selectors-in-javascript-in-groovy-in-test-cases'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00094_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
